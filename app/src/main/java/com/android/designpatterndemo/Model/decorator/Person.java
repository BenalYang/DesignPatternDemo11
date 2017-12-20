package com.android.designpatterndemo.Model.decorator;

/**
 * Created by Administrator on 17-12-6 0006.
 */

public class Person implements Component {
    String mName;
    String mgotTechnical;

    public Person(String name){
        mName = name;
        mgotTechnical = "";
    }

    @Override
    public String getTechnical(){
        return mName;
    }
}
