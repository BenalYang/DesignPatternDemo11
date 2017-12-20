package com.android.designpatterndemo.bean;

/**
 * Created by Administrator on 17-12-6 0006.
 *
 */

public class DPResContext {
    public enum RetState {
        OUT_OK,
        OUT_FAILED
    }

    public RetState retState;

    public int para1;
    public int para2;
    public String strPara;

    @Override
    public String toString() {
        String res = "";
        res = "para1: " + para1 + "\n";
        res += "para2: " + para2 + "\n";
        res += "strPara: " + (strPara == null ? "" : strPara) + "\n";

        return res;
    }
}
