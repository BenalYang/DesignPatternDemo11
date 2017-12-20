package com.android.designpatterndemo.Model.decorator;

/**
 * Created by Administrator on 17-12-6 0006.
 */

public class ClearDesktop extends Technical {

    @Override
    public String getTechnical(){

        String strTechnical = super.getTechnical();
        strTechnical = strTechnical + "学会新技能【擦桌子】\n";

        return strTechnical;
    }
}
