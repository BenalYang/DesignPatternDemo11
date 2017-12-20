package com.android.designpatterndemo.Model.proxy;

/**
 * Created by Administrator on 17-12-7 0007.
 */

public class Mahuateng extends Celebrity {
    public Mahuateng() {
        super("马化腾");
    }

    @Override
    public String speak() {
        return "腾讯是个山寨王国";
    }
}
