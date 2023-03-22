package com.ronbay.desigin.module.observer.demo02;


import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName: Teacher
 * @Description:
 * @Author
 * @Date 2022/3/24
 * @Version 1.0
 */
public class Teacher implements Observer {

    private String name;

    public Teacher(String name){
        this.name = name;
    }

    public void update(Observable o,Object arg){
        Gper gper = (Gper)o;
        Question question = (Question)arg;
        System.out.println("================");
        System.out.println(name + "老师，你好！\n" + "您收到了一个来自" + gper.getName() + "的提问，希望您解答，问题内容如下:\n" +
                question.getContent() + "\n" + "提问者:" + question.getUsername()
                );
    }
}
