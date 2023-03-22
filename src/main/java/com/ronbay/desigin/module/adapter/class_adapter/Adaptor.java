package com.ronbay.desigin.module.adapter.class_adapter;

/**
 * @Description:
 * @Author
 * @Date 2023/3/15
 * @Version 1.0
 */
public class Adaptor extends Adaptee implements ITarget{
    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {
        super.fb();
    }

    @Override
    public void f3() {
        super.fc();
    }
}
