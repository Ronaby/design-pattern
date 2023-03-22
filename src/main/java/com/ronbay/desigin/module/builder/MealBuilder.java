package com.ronbay.desigin.module.builder;

/**
 * @ClassName: MealBuilder
 * @Description: 实际的 builder 类负责创建 Meal 对象
 * @Author
 * @Date 2021/11/23
 * @Version 1.0
 */
public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
