package com.android.designpatterndemo.Views;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.designpatterndemo.R;
import com.android.designpatterndemo.bean.DPContext;

/**
 * Created by Administrator on 17-12-5 0005.
 */

public class FailedFragment extends DPDAbstractFragment {
    TextView tv_info = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_introduce, container, false);

        tv_info = (TextView) view.findViewById(R.id.tv_intip);
        tv_info.setText("施工中，即将展示...");
        tv_info.setTextSize(20);

        return view;
    }

    @Override
    public DPContext getInput() {
        return null;
    }
}
