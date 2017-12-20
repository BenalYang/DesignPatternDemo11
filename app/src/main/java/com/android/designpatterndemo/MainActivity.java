package com.android.designpatterndemo;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.android.designpatterndemo.Presenter.DPDPresenterCom;
import com.android.designpatterndemo.Views.DPDAbstractFragment;
import com.android.designpatterndemo.Views.DPDView.DecoratorFragment;
import com.android.designpatterndemo.Views.DPDView.ProxyFragment;
import com.android.designpatterndemo.Views.DPDView.SimpleFactoryFragment;
import com.android.designpatterndemo.Views.DPDView.StategyFragment;
import com.android.designpatterndemo.Views.DPDView.TemplateFragment;
import com.android.designpatterndemo.Views.IntroduceFragment;
import com.android.designpatterndemo.Views.UndoneFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView lv_dpd_items = null;
    int mPrePosition = 0;
    DPDPresenterCom dpdPresenterCom;
    private final String[][] mData = new String[][]{
            {"首页", IntroduceFragment.class.getName()},
            {"简单工厂模式", SimpleFactoryFragment.class.getName()},
            {"策略模式", StategyFragment.class.getName()},
            {"装饰模式", DecoratorFragment.class.getName()},
            {"代理模式", ProxyFragment.class.getName()},
            {"工厂方法模式", UndoneFragment.class.getName()},
            {"原型模式", UndoneFragment.class.getName()},
            {"模板方法模式", TemplateFragment.class.getName()},
            {"外观模式", UndoneFragment.class.getName()},
            {"建造者模式", UndoneFragment.class.getName()}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(String[] util : mData){
            FragmentManager.RegisteView(util[0], util[1]);
        }

        // Check that the activity is using the layout version with
        // the fragment_container FrameLayout
        if (findViewById(R.id.fragment_container) != null) {

            // However, if we're being restored from a previous state,
            // then we don't need to do anything and should return or else
            // we could end up with overlapping fragments.
            if (savedInstanceState != null) {
                return;
            }

            // Add the fragment to the 'fragment_container' FrameLayout
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, new IntroduceFragment()).commit();
        }

        lv_dpd_items = (ListView) findViewById(R.id.lv_dpd_item);
        lv_dpd_items.setAdapter(new ArrayAdapter<String>(this, R.layout.simple_dpd_list_item, getData()));
        lv_dpd_items.setOnItemClickListener(this);
    }

    private List<String> getData() {
        List<String> data = new ArrayList<String>();
        for(String[] util : mData){
            data.add(util[0]);
        }

        return data;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        DPDAbstractFragment dpdFragment;

        if (mPrePosition == position) {
            return;
        }
        mPrePosition = position;

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        dpdFragment = FragmentManager.getView(((TextView)view).getText().toString());

        transaction.replace(R.id.fragment_container, dpdFragment);
        transaction.commit();

        dpdPresenterCom = new DPDPresenterCom(dpdFragment);
        dpdFragment.setOnStartCallback(dpdPresenterCom);
    }
}
