package com.android.designpatterndemo.Model.template;

/**
 * Created by Administrator on 17-12-8 0008.
 */

public class Laugh extends AbstrcExpress {

    @Override
    protected String DrawBackground() {
        return "->Laugh<-";
    }

    @Override
    protected String DrawForeground() {
        return "^_^ ^_^ ^_^";
    }
}
