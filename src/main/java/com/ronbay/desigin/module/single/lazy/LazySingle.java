package com.ronbay.desigin.module.single.lazy;

/**
 * 懒加载模式
 */
public class LazySingle {

    private LazySingle(){}

    public static LazySingle instance = null;
    public static LazySingle getInstance(){
        if (instance == null){
            instance = new LazySingle();
        }
        return instance;
    }

}
