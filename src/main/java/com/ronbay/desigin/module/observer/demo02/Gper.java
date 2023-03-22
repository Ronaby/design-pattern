package com.ronbay.desigin.module.observer.demo02;

import java.util.Observable;

/**
 * @ClassName: Gper
 * @Description:
 * @Author
 * @Date 2022/3/24
 * @Version 1.0
 */
public class Gper extends Observable {

    private String name="Gper生态圈";
    private static Gper gper = null;

    private Gper(){}

    public static Gper getInstance(){
        if (null == gper){
            gper = new Gper();
        }
        return gper;
    }

    public String getName(){
        return name;
    }

//    public void publishQuestion(Question question){
//        System.out.println(question.getUsername() + "在" +this.name + "上交了一个问题,");
//        setChanged();
//        notifyObservers(question);
//    }
}
