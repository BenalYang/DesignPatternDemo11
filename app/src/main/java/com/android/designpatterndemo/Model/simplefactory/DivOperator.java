package com.android.designpatterndemo.Model.simplefactory;

/**
 * Created by Administrator on 17-12-6 0006.
 */

public class DivOperator implements Operator {
    @Override
    public int Calculate(int num1, int num2) {
        if(num2 == 0){ //分母不能是0
            return 0;
        }
        return num1 / num2;
    }
}
