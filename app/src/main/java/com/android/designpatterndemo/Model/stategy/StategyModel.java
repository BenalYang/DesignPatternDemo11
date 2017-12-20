package com.android.designpatterndemo.Model.stategy;

import com.android.designpatterndemo.Model.IDPDModel;
import com.android.designpatterndemo.bean.DPContext;
import com.android.designpatterndemo.bean.DPResContext;

/**
 * Created by Administrator on 17-12-6 0006.
 * 演示说明:
 *      客户端随机选择策略传入，根据客户端选择的策略进行执行
 *      对应的策略子类实例
 */

public class StategyModel implements IDPDModel {
    @Override
    public DPResContext getResult(DPContext dpContext) {

        DPResContext dpResContext = new DPResContext();
        StategyContext sct = new StategyContext();

        switch (dpContext.para1){
            case 0:
                sct.setStategyContext(new StategySubA());
                break;
            case 1:
                sct.setStategyContext(new StategySubB());
                break;
            case 2:
                sct.setStategyContext(new StategySubC());
                break;
            case 3:
                sct.setStategyContext(new StategySubD());
                break;
            default:
                break;
        }
        String sd = sct.doStetegyDemo();
        if(sd != null){
            dpResContext.retState = DPResContext.RetState.OUT_OK;
            dpResContext.strPara = sd;
        }
        else{
            dpResContext.retState = DPResContext.RetState.OUT_FAILED;
        }

        return dpResContext;
    }
}
