package com.ronbay.desigin.module.single.test;

import com.ronbay.desigin.module.single.hungry.HungrySingle;
import com.ronbay.desigin.module.single.lazy.LazySingle;
import com.ronbay.desigin.module.single.lazy.LazySingleTwo;
import com.ronbay.desigin.module.single.lazy.LazyThree;
import com.ronbay.desigin.module.single.register.SingleSeriable;

import java.io.*;
import java.util.concurrent.CountDownLatch;

public class TreadSafeTest {
    public static void main(String[] args) {
//        int count = 100;
//        CountDownLatch countDownLatch = new CountDownLatch(count);
//        for (int i=0;i<count;i++){
//            new Thread(){
//                @Override
//                public void run(){
//                    try {
//                        countDownLatch.await();
//                         //HungrySingle.getInstance();
////                        LazySingleTwo lazySingle =  LazySingleTwo.getInstance();
//                        LazyThree lazySingle = LazyThree.getInstance();
//                        System.out.println(System.currentTimeMillis() + ":" + lazySingle);
//                    }catch (Exception e){
//                        e.printStackTrace();
//                    }
//                }
//            }.start();
//            countDownLatch.countDown();
//        }
        SingleSeriable s1 = null;
        SingleSeriable s2 = SingleSeriable.getInstance();
        File file;
        try{
            FileOutputStream fos = new FileOutputStream("seriable.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("seriable.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SingleSeriable)ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
