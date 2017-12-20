package com.android.designpatterndemo.Model.decorator;

/**
 * Created by Administrator on 17-12-6 0006.
 */

public class WashClothes extends Technical {

    @Override
    public String getTechnical(){

        String strTechnical = super.getTechnical();
        strTechnical = strTechnical + "学会新技能【洗衣服】\n";

        return strTechnical;
    }
}
