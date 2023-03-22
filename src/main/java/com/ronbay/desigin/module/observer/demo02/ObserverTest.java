package com.ronbay.desigin.module.observer.demo02;

/**
 * @Description: 观察者模式测试类
 * @Author
 * @Date 2022/3/24
 * @Version 1.0
 */
public class ObserverTest {

    public static void main(String[] args) {
        Gper gper = Gper.getInstance();
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("mic");
        gper.addObserver(tom);
        gper.addObserver(mic);

        //业务逻辑代码
        Question question = new Question();
        question.setUsername("小明");
        question.setContent("观察者模式用于那些场景");
    }
}
