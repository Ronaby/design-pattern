package com.ronbay.desigin.module.single.doublecheck;

/**
 * 双检模式
 */
public class DoubleCheckSingle {

    private static DoubleCheckSingle instance = null;

    private DoubleCheckSingle(){}

    public static DoubleCheckSingle getInstance(){
        if (instance == null){
            synchronized (DoubleCheckSingle.class){
                if (instance == null){
                    instance = new DoubleCheckSingle();
                }
            }
        }
        return instance;
    }

}
