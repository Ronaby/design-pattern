package com.ronbay.desigin.module.single.lazy;

public class LazySingle1 {

    private static  boolean initialized  = false;

    private LazySingle1(){
        synchronized (LazySingle1.class){
            if (!initialized){
                initialized = true;
            }else{
                throw new RuntimeException("单例已被侵犯");
            }
        }
    }

    public static class LazySingle1Holder{
        private static LazySingle1 instance = new LazySingle1();
    }

    public static LazySingle1 getInstance(){
        return LazySingle1Holder.instance;
    }
}

