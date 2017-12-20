package com.android.designpatterndemo.Views.DPDView;

import android.widget.ArrayAdapter;

import com.android.designpatterndemo.Views.DPDCommFragment;
import com.android.designpatterndemo.bean.DPContext;
import com.android.designpatterndemo.bean.DPResContext;

import java.util.ArrayList;

/**
 * Created by Administrator on 17-12-5 0005.
 */

public class TemplateFragment extends DPDCommFragment {

    @Override
    public void ConfigInteWidget() {
        ArrayList<String> data_list = new ArrayList<String>() {{
            add("笑");
            add("哭");
            add("怒");
            add("悲");
        }};

        //适配器
        ArrayAdapter<String> arr_adapter =
                new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, data_list);
        //设置样式
        arr_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //加载适配器
        spn_comm.setAdapter(arr_adapter);
        btn_comm.setText("Excecute");
        txv_res.setHint("个性化执行结果");
    }

    @Override
    protected DPContext.DPType getDPType() {
        return  DPContext.DPType.TEMPLATE;
    }

    @Override
    public void showResult(DPResContext resContext){
        if(resContext.retState == DPResContext.RetState.OUT_OK) {
            txv_res.setText("Choose: " + (String) spn_comm.getSelectedItem()
                    + "\nExecute: \n" + resContext.strPara);
        }
    }
}
