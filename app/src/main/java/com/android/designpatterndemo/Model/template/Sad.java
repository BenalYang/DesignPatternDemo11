package com.android.designpatterndemo.Model.template;

/**
 * Created by Administrator on 17-12-8 0008.
 */

public class Sad extends AbstrcExpress {

    @Override
    protected String DrawBackground() {
        return "->Sad<-";
    }

    @Override
    protected String DrawForeground() {
        return "!-! !-!";
    }
}
