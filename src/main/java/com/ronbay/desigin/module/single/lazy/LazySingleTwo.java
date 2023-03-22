package com.ronbay.desigin.module.single.lazy;

/**
 * 懒加载模式
 */
public class LazySingleTwo {

    private LazySingleTwo(){}

    public static LazySingleTwo instance = null;
    public static synchronized LazySingleTwo getInstance(){
        if (instance == null){
            instance = new LazySingleTwo();
        }
        return instance;
    }

}
