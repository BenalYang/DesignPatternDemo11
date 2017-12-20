package com.android.designpatterndemo.Model.proxy;

import android.support.annotation.NonNull;

/**
 * Created by Administrator on 17-12-7 0007.
 */

public abstract class Celebrity implements Person {
    String mName = "";

    public Celebrity(@NonNull String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }
}
