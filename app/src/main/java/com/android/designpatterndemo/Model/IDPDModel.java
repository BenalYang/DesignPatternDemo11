package com.android.designpatterndemo.Model;

import com.android.designpatterndemo.bean.DPContext;
import com.android.designpatterndemo.bean.DPResContext;

/**
 * Created by Administrator on 17-12-5 0005.
 */

public interface IDPDModel {
    DPResContext getResult(DPContext dpContext);
}
