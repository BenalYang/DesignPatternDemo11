package com.android.designpatterndemo.Views;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.android.designpatterndemo.R;
import com.android.designpatterndemo.bean.DPContext;
import com.android.designpatterndemo.bean.DPResContext;

/**
 * Created by Administrator on 17-12-5 0005.
 * DPDView的模板类,大部分设计模式Fragment(DPDView)
 * 可继承该类，实现两个抽象方法来作为演示设计view实例
 */

public abstract class DPDCommFragment extends DPDAbstractFragment{
    protected Button btn_comm = null;
    protected Spinner spn_comm = null;
    protected TextView txv_res = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dpd_comm, container, false);

        btn_comm = (Button) view.findViewById(R.id.btn_comm_exe);
        btn_comm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (mOnStartDemoLsn != null) {
                    mOnStartDemoLsn.onStartDemo();
                }
            }
        });
        spn_comm = (Spinner) view.findViewById(R.id.spn_comm);
        txv_res = (TextView) view.findViewById(R.id.tv_comm_result);

        ConfigInteWidget();

        return view;
    }

    @Override
    public DPContext getInput() {
        DPContext dpContext = new DPContext();
        dpContext.type = getDPType();

        try {
//            dpContext.strPara = (String) spn_stategy.getSelectedItem();
            dpContext.para1 = spn_comm.getSelectedItemPosition();

            dpContext.state = DPContext.State.INPUT_OK;
        } catch (Exception e) {
            dpContext.state = DPContext.State.INPUT_WRONG;
        }

        return dpContext;
    }


    @Override
    public void showResult(DPResContext resContext) {
        if (resContext.retState == DPResContext.RetState.OUT_OK) {
            txv_res.setText(resContext.strPara);
        }
    }

    /**
     * 子类个性化方法
     */
    protected abstract void ConfigInteWidget();
    protected abstract DPContext.DPType getDPType();
}
