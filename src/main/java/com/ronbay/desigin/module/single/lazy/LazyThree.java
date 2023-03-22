package com.ronbay.desigin.module.single.lazy;

public class LazyThree {

    private static boolean initialized = false;
    private LazyThree(){
        synchronized (LazyThree.class){
            if (!initialized){
                initialized = true;
            }else {
                throw new RuntimeException("单例已被侵犯");
            }
        }
    }

    public static final LazyThree getInstance(){
        return LazyHolder.lazyThree;
    }
    private static class LazyHolder{
        static final LazyThree lazyThree = new LazyThree();
    }
}
