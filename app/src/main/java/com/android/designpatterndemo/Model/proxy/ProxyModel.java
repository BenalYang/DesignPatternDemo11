package com.android.designpatterndemo.Model.proxy;

import com.android.designpatterndemo.Model.IDPDModel;

import com.android.designpatterndemo.bean.DPContext;
import com.android.designpatterndemo.bean.DPResContext;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 17-12-6 0006.
 * 演示说明:
 *      Client传入需要代理的名人序号，
 *      Proxyer代理指定序号的Celebrity的子类，
 *      传达他们的口头信息
 */

public class ProxyModel implements IDPDModel {

    @Override
    public DPResContext getResult(DPContext dpContext) {

        DPResContext dpResContext = new DPResContext();
        Proxyer proxyer = new Proxyer();

        dpResContext.retState = DPResContext.RetState.OUT_OK;
        switch (dpContext.para1) {
            case 0:
                proxyer.setAuthorizer(new Aobama());
                break;
            case 1:
                proxyer.setAuthorizer(new Xijinping());
                break;
            case 2:
                proxyer.setAuthorizer(new Mayun());
                break;
            case 3:
                proxyer.setAuthorizer(new Mahuateng());
                break;
            case 4:
                proxyer.setAuthorizer(new Leijun());
                break;
            default:
                dpResContext.retState = DPResContext.RetState.OUT_FAILED;
                break;
        }

        if(dpResContext.retState == DPResContext.RetState.OUT_OK) {
            dpResContext.strPara = proxyer.speak();
        }

        return dpResContext;
    }
}
