package com.ronbay.desigin.module.strategy;

public class MultipyOperate implements Strategy{
    @Override
    public int operate(int num1, int num2) {
        return num1 * num2;
    }
}
