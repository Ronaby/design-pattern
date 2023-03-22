package com.ronbay.desigin.module.strategy;

public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int excuteStrategy(int num1,int num2){
        return strategy.operate(num1,num2);
    }
}
