package com.android.designpatterndemo.Model.proxy;

/**
 * Created by Administrator on 17-12-7 0007.
 */

public class Proxyer implements Person {
    Celebrity mCelebrity;

    public void setAuthorizer(Celebrity celebrity) {
        mCelebrity = celebrity;
    }

    @Override
    public String speak() {
        String msg = null;

        if(mCelebrity != null){
            msg = "代表【"+ mCelebrity.getName() +  "】说: "
                    + mCelebrity.speak();
        }

        return msg;
    }
}
