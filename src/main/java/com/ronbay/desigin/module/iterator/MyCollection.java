package com.ronbay.desigin.module.iterator;

/**
 * @Description: 集合实现类
 * @Author
 * @Date 2023/3/24
 * @Version 1.0
 */
public class MyCollection<T> implements Iterator<T>{
    private T[] elements;
    private int index;

    public MyCollection(T[] elements) {
        this.elements = elements;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < elements.length;
    }

    @Override
    public T next() {
        return elements[index++];
    }
}
