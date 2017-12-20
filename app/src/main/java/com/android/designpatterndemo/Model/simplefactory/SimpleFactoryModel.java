package com.android.designpatterndemo.Model.simplefactory;

import com.android.designpatterndemo.Model.IDPDModel;
import com.android.designpatterndemo.bean.DPContext;
import com.android.designpatterndemo.bean.DPResContext;

/**
 * Created by Administrator on 17-12-6 0006.
 * 演示说明:
 *      一个四则运算的算术例子，由OperatorFactory工厂类依据传入的“算术符”
 *      生成运算符子类，并由创建的子类实例进行计算
 */

public class SimpleFactoryModel implements IDPDModel {
    @Override
    public DPResContext getResult(DPContext dpContext) {

        DPResContext dpResContext = new DPResContext();
        Operator op = new OperatorFactory().Creat(dpContext.strPara);

        if(op != null) {
            dpResContext.para1 = op.Calculate(dpContext.para1, dpContext.para2);
            dpResContext.retState = DPResContext.RetState.OUT_OK;
        }
        else{
            dpResContext.retState = DPResContext.RetState.OUT_FAILED;
        }

        return dpResContext;
    }
}
