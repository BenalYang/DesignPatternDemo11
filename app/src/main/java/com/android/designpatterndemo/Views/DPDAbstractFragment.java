package com.android.designpatterndemo.Views;

import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.android.designpatterndemo.Presenter.OnStartDemoListener;
import com.android.designpatterndemo.bean.DPResContext;

/**
 * Created by Administrator on 17-12-5 0005.
 */

public abstract class DPDAbstractFragment extends Fragment implements IDPDView {
    protected OnStartDemoListener mOnStartDemoLsn;

    @Override
    public void setOnStartCallback(OnStartDemoListener l) {
        mOnStartDemoLsn = l;
    }


    @Override
    public void showError(String errMsg) {
        Toast.makeText(getContext(), errMsg, Toast.LENGTH_LONG).show();
    }

    @Override
    public void showResult(DPResContext resContext){
        Toast.makeText(getContext(), resContext.toString(), Toast.LENGTH_LONG).show();
    }
}
