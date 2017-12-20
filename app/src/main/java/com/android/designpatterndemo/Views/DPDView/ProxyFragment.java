package com.android.designpatterndemo.Views.DPDView;

import android.widget.ArrayAdapter;

import com.android.designpatterndemo.Views.DPDCommFragment;
import com.android.designpatterndemo.bean.DPContext;

import java.util.ArrayList;

/**
 * Created by Administrator on 17-12-5 0005.
 */

public class ProxyFragment extends DPDCommFragment {

    @Override
    public void ConfigInteWidget() {
        ArrayList<String> data_list = new ArrayList<String>() {{
            add("奥巴马");
            add("习近平");
            add("马云");
            add("马化腾");
            add("雷军");
        }};

        //适配器
        ArrayAdapter<String> arr_adapter =
                new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, data_list);
        //设置样式
        arr_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //加载适配器
        spn_comm.setAdapter(arr_adapter);
        btn_comm.setText("Pass message");
        txv_res.setHint("代理人传话");
    }

    @Override
    protected DPContext.DPType getDPType() {
        return DPContext.DPType.PROXY;
    }
}
