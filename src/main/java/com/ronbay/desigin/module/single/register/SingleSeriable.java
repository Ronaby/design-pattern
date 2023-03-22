package com.ronbay.desigin.module.single.register;

import java.io.Serializable;

public class SingleSeriable implements Serializable {

    public final static SingleSeriable INSTANCE = new SingleSeriable();

    private SingleSeriable(){}

    public static SingleSeriable getInstance(){
        return INSTANCE;
    }

    private Object readResolve(){
        return INSTANCE;
    }

}
