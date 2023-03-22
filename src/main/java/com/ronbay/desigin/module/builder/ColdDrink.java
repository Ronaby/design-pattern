package com.ronbay.desigin.module.builder;

/**
 * @ClassName: ColdDrink
 * @Description: 冷饮类-实现Item接口
 * @Author
 * @Date 2021/11/23
 * @Version 1.0
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();

}
