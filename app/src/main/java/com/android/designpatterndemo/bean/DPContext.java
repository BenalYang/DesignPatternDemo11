package com.android.designpatterndemo.bean;

/**
 * Created by Administrator on 17-12-5 0005.
 *
 */

public class DPContext {
    public enum DPType{
        SIMPLE_FACTORY,
        STRATEGY,
        DECORATOR,
        PROXY,
        FACTORY,
        PROTOTYPE,
        TEMPLATE,
        FACADE,
        BUILDER,

        UNKNOW_DP
    }

    public enum State{
        INPUT_OK,
        INPUT_NOT_COMPLETE,
        INPUT_WRONG,
    }

    public DPType type = DPType.UNKNOW_DP;
    public State state  = State.INPUT_NOT_COMPLETE;

    public int para1;
    public int para2;
    public String strPara;
}
