package com.android.designpatterndemo.Model.proxy;

/**
 * Created by Administrator on 17-12-7 0007.
 */

public class Mayun extends Celebrity {
    public Mayun() {
        super("马云");
    }

    @Override
    public String speak() {
        return "一个月赚二十亿很难受";
    }
}
