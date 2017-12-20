package com.android.designpatterndemo.Model.template;

/**
 * Created by Administrator on 17-12-8 0008.
 */

public abstract class AbstrcExpress {

    public String DrawPictrue() {
        String retPic = DrawUpFrame() + "\n"+
                DrawBackground() + "\n" +
                DrawForeground() + "\n" +
                DrawBottomFrame();

        return retPic;
    }

    protected String DrawUpFrame() {
        return DrawHorizontalFrame();
    }

    protected String DrawBottomFrame() {
        return DrawHorizontalFrame();
    }

    protected String DrawHorizontalFrame() {
        return "---------------" ;
    }

    protected abstract String DrawBackground();
    protected abstract String DrawForeground();
}
