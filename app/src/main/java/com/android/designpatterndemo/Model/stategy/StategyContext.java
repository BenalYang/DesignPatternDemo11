package com.android.designpatterndemo.Model.stategy;

/**
 * Created by Administrator on 17-12-6 0006.
 */

public class StategyContext {

    Stategy mStategy ;

    public void setStategyContext(Stategy stategy){
        mStategy = stategy;
    }

    public String doStetegyDemo(){
        if(mStategy == null){
            return null;
        }
        return mStategy.doAlgonrithm();
    }
}
