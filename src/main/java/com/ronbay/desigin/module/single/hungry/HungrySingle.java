package com.ronbay.desigin.module.single.hungry;

public class HungrySingle {
    private HungrySingle(){}
    //类加载顺序，先静态后动态
    //先属性后方法
    //先上后下
    private static final HungrySingle hungryInstance = new HungrySingle();

    public static HungrySingle getInstance(){
        System.out.println(System.currentTimeMillis() + ":" + hungryInstance);
        return hungryInstance;
    }
}
