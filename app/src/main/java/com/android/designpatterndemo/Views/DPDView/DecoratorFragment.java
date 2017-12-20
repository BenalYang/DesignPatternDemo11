package com.android.designpatterndemo.Views.DPDView;

import android.widget.ArrayAdapter;

import com.android.designpatterndemo.Views.DPDCommFragment;
import com.android.designpatterndemo.bean.DPContext;

import java.util.ArrayList;

/**
 * Created by Administrator on 17-12-5 0005.
 */

public class DecoratorFragment extends DPDCommFragment {

    @Override
    public void ConfigInteWidget() {
        ArrayList<String> data_list = new ArrayList<String>() {{
            add("扫地");
            add("洗碗");
            add("洗衣服");
            add("擦桌子");
        }};

        //适配器
        ArrayAdapter<String> arr_adapter =
                new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, data_list);
        //设置样式
        arr_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //加载适配器
        spn_comm.setAdapter(arr_adapter);
        btn_comm.setText("Decorator");
        txv_res.setHint("装饰后结果");
    }

    @Override
    protected DPContext.DPType getDPType() {
        return DPContext.DPType.DECORATOR;
    }
}
