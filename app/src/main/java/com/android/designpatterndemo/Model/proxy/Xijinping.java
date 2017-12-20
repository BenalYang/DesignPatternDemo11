package com.android.designpatterndemo.Model.proxy;

/**
 * Created by Administrator on 17-12-7 0007.
 */

public class Xijinping extends Celebrity {
    public Xijinping() {
        super("习近平");
    }

    @Override
    public String speak() {
        return "中国是四大文明古国之一";
    }
}
