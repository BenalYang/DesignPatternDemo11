package com.android.designpatterndemo.Model.simplefactory;

/**
 * Created by Administrator on 17-12-6 0006.
 */

public class AddOperator implements Operator {
    @Override
    public int Calculate(int num1, int num2) {
        return num1 + num2;
    }
}
