package com.android.designpatterndemo.Model.decorator;

import com.android.designpatterndemo.Model.IDPDModel;
import com.android.designpatterndemo.bean.DPContext;
import com.android.designpatterndemo.bean.DPResContext;

/**
 * Created by Administrator on 17-12-6 0006.
 * 演示说明:
 *      通过四个技能装饰Person类，Client传入选择学习的新技能，
 *      如果该技能未学习过，则学习该技能(用该技能装饰Person)
 */

public class DecoratorModel implements IDPDModel {
    Person person = null;
    Technical der = null;
    Component person_der = null;
    int iTechnicalFlag = 0x00; //记录指定的技能是否已经学会，会的话不再学习

    @Override
    public DPResContext getResult(DPContext dpContext) {

        DPResContext dpResContext = new DPResContext();

        if(person == null){
            person = new Person("小明\n");
            person_der = person;
        }
        if((iTechnicalFlag & (1<<dpContext.para1)) == 0 ) {
            switch (dpContext.para1) {
                case 0:
                    der = new SweepFloor();
                    break;
                case 1:
                    der = new WashDisher();
                    break;
                case 2:
                    der = new WashClothes();
                    break;
                case 3:
                    der = new ClearDesktop();
                    break;
                default:
                    break;
            }
            iTechnicalFlag = iTechnicalFlag | (1<<dpContext.para1);
            der.setmComponent(person_der);
            person_der = der;

            dpResContext.strPara = der.getTechnical();
            dpResContext.retState = DPResContext.RetState.OUT_OK;
        }
        return dpResContext;
    }
}
