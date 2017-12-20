package com.android.designpatterndemo.Model.decorator;

import android.support.annotation.CallSuper;

/**
 * Created by Administrator on 17-12-6 0006.
 */

public abstract class Technical implements Component {

    protected Component mComponent;


    public void setmComponent(Component component){
        mComponent = component;
    }

    @CallSuper
    public String getTechnical(){
        if(mComponent != null) {
            return mComponent.getTechnical();
        }
        return null;
    }

}
