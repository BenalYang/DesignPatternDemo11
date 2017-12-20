package com.android.designpatterndemo.Toolkit;

import android.util.Log;

/**
 * Created by Administrator on 17-10-28 0028.
 */

public class Debugger {
    static final String Degbug_TAG = "DesignPattern";

    public static void debug(String msg){
        Log.v(Degbug_TAG, msg);
    }
}
