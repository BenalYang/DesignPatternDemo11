package com.android.designpatterndemo.Model.template;

import com.android.designpatterndemo.Model.IDPDModel;
import com.android.designpatterndemo.bean.DPContext;
import com.android.designpatterndemo.bean.DPResContext;

/**
 * Created by Administrator on 17-12-6 0006.
 * 演示说明:
 *      客户端随机选择表情类型传入，根据客户端选择的表情类型生成
 *      表情实例。
 *      模板类(AbstrcExpress)中的DrawPictrue包括构造了整个绘画
 *      结构，由子类完成部分细节绘制
 */

public class TemplateModel implements IDPDModel {
    @Override
    public DPResContext getResult(DPContext dpContext) {

        DPResContext dpResContext = new DPResContext();
        AbstrcExpress pic = null;

        switch (dpContext.para1){
            case 0:
                pic = new Laugh();
                break;
            case 1:
                pic = new Cry();
                break;
            case 2:
                pic = new Angry();
                break;
            case 3:
                pic =new Sad();
                break;
            default:
                break;
        }

        if(pic != null){
            String sd = pic.DrawPictrue();
            dpResContext.retState = DPResContext.RetState.OUT_OK;
            dpResContext.strPara = sd;
        }
        else{
            dpResContext.retState = DPResContext.RetState.OUT_FAILED;
        }

        return dpResContext;
    }
}
