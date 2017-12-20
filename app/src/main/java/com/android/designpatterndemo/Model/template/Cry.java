package com.android.designpatterndemo.Model.template;

/**
 * Created by Administrator on 17-12-8 0008.
 */

public class Cry extends AbstrcExpress {

    @Override
    protected String DrawBackground() {
        return "->Cry<-";
    }

    @Override
    protected String DrawForeground() {
        return "ㄒoㄒ ㄒoㄒ";
    }
}
