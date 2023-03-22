package com.ronbay.desigin.module.adapter.target_adapter;

/**
 * @ClassName: Adaptor
 * @Description:
 * @Author
 * @Date 2023/3/15
 * @Version 1.0
 */
public class Adaptor implements Itarget{

    private Adaptee adaptee;
    public Adaptor(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void f1() {
        adaptee.fa();
    }

    @Override
    public void f2() {
        adaptee.fb();
    }

    @Override
    public void f3() {
        adaptee.fc();
    }
}
