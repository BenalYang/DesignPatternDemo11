package com.android.designpatterndemo.Views;

import com.android.designpatterndemo.FragmentEventCallback;
import com.android.designpatterndemo.bean.DPContext;
import com.android.designpatterndemo.bean.DPResContext;

/**
 * Created by Administrator on 17-12-5 0005.
 */

public interface IDPDView extends FragmentEventCallback {
    DPContext getInput();
    void showResult(DPResContext resContext);
    void showError(String errMsg);
}
