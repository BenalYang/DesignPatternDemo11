package com.android.designpatterndemo.Model.simplefactory;

import android.content.res.Resources;

import com.android.designpatterndemo.R;

/**
 * Created by Administrator on 17-12-6 0006.
 */

public class OperatorFactory {

    public Operator Creat(String symbol) {

        Operator opret = null;

        if(symbol.equals("+")){
            opret =new AddOperator();
        }
        else if(symbol.equals("-")){
            opret =new SubOperator();
        }
        else if(symbol.equals("×")){
            opret =new MulOperator();
        }
        else if(symbol.equals("÷")){
            opret =new DivOperator();
        }

        return opret;
    }
}
