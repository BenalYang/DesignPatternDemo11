package com.android.designpatterndemo.Model.proxy;

import android.support.annotation.NonNull;

/**
 * Created by Administrator on 17-12-7 0007.
 */

public class Aobama extends Celebrity {
    public Aobama() {
        super("奥巴马");
    }

    @Override
    public String speak() {
        return "美利坚合众国是最好的国家";
    }
}
