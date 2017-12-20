package com.android.designpatterndemo.Views.DPDView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.android.designpatterndemo.Toolkit.ConvertTool;
import com.android.designpatterndemo.Views.DPDAbstractFragment;
import com.android.designpatterndemo.bean.DPContext;
import com.android.designpatterndemo.R;
import com.android.designpatterndemo.bean.DPResContext;

/**
 * Created by Administrator on 17-12-5 0005.
 */

public class SimpleFactoryFragment extends DPDAbstractFragment {
    Button btn_calc = null;
    EditText ed_para1 = null;
    EditText ed_para2 = null;
    Spinner spn_symbol = null;
    TextView txv_res = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple_factory, container, false);

        btn_calc = (Button) view.findViewById(R.id.btn_calc);
        btn_calc.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(mOnStartDemoLsn != null){
                    mOnStartDemoLsn.onStartDemo();
                }
            }
        });

        ed_para1 = (EditText) view.findViewById(R.id.et_num1);
        ed_para2 = (EditText) view.findViewById(R.id.et_num2);
        spn_symbol = (Spinner) view.findViewById(R.id.spn_alg_symbol);
        txv_res = (TextView) view.findViewById(R.id.alg_result);


        return view;
    }

    @Override
    public DPContext getInput() {
        DPContext dpContext = new DPContext();
        dpContext.type = DPContext.DPType.SIMPLE_FACTORY;

        try {
            dpContext.para1 = ConvertTool.String2Int(ed_para1.getText().toString());
            dpContext.para2 = ConvertTool.String2Int(ed_para2.getText().toString());
            dpContext.strPara = (String) spn_symbol.getSelectedItem();

            dpContext.state = DPContext.State.INPUT_OK;
        }
        catch (Exception e){
            dpContext.state = DPContext.State.INPUT_WRONG;
        }

        return dpContext;
    }

    @Override
    public void showResult(DPResContext resContext){
        if(resContext.retState == DPResContext.RetState.OUT_OK) {
            txv_res.setText("" + resContext.para1);
        }
    }

}
