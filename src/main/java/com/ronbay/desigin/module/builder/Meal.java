package com.ronbay.desigin.module.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Meal
 * @Description:
 * @Author
 * @Date 2021/11/23
 * @Version 1.0
 */
public class Meal {

    private List<Item> items = new ArrayList<>();

    void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item:items){
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item:items){
            System.out.print("Item:" + item.name());
            System.out.print(",Packing:" + item.packing().pack());
            System.out.print(",Price:" + item.price());
        }
    }
}
