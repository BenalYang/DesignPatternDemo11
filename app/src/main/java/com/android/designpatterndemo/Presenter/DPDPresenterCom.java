package com.android.designpatterndemo.Presenter;

import com.android.designpatterndemo.Model.IDPDModel;
import com.android.designpatterndemo.Model.template.TemplateModel;
import com.android.designpatterndemo.Model.decorator.DecoratorModel;
import com.android.designpatterndemo.Model.proxy.ProxyModel;
import com.android.designpatterndemo.Model.simplefactory.SimpleFactoryModel;
import com.android.designpatterndemo.Model.stategy.StategyModel;
import com.android.designpatterndemo.Views.IDPDView;
import com.android.designpatterndemo.bean.DPContext;
import com.android.designpatterndemo.bean.DPResContext;

/**
 * Created by Administrator on 17-12-6 0006.
 */

public class DPDPresenterCom implements IDPDPresenter, OnStartDemoListener {

    IDPDView mView;
    IDPDModel mModel;
    DPContext.DPType preType = DPContext.DPType.UNKNOW_DP;

    public DPDPresenterCom(IDPDView v){
        mView = v;
    }

    @Override
    public void doDemo() {
        DPContext context;
        DPResContext resContext;

        context = mView.getInput();
        try {
            if (context == null ||
                    context.state != DPContext.State.INPUT_OK) {
                throw new RuntimeException("INPUT NOT OK");
            }

            switch (context.type){
                case SIMPLE_FACTORY:
                    mModel = new SimpleFactoryModel();
                    break;
                case STRATEGY:
                    mModel = new StategyModel();
                    break;
                case DECORATOR:
                    if(preType != context.type) {
                        mModel = new DecoratorModel();
                    }
                    break;
                case PROXY:
                    mModel = new ProxyModel();
                    break;
                case FACTORY:
                    break;
                case PROTOTYPE:
                    break;
                case TEMPLATE:
                    mModel = new TemplateModel();
                    break;
                case FACADE:
                    break;
                case BUILDER:
                    break;
                default:
                    break;
            }

            resContext = mModel.getResult(context);

            mView.showResult(resContext);
            if(preType != context.type){
                preType = context.type;
            }
        }
        catch (RuntimeException e){
            mView.showError(e.getMessage());
            e.printStackTrace();
        }

    }

    @Override
    public void onStartDemo() {
        doDemo();
    }

}
