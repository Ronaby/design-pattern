package com.ronbay.desigin.module.iterator;

/**
 * @Description: 迭代器模式测试类
 * @Author
 * @Date 2023/3/24
 * @Version 1.0
 */
public class IteratorTest {
    public static void main(String[] args) {
        Integer[] elements = {1,2,3,4,5};
        MyCollection<Integer> myCollection = new MyCollection<Integer>(elements);
        while (myCollection.hasNext()){
            System.out.println(myCollection.next());
        }
    }
}
