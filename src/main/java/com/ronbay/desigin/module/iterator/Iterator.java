package com.ronbay.desigin.module.iterator;

/**
 * @Description: 迭代器模式接口
 * @Author
 * @Date 2023/3/24
 * @Version 1.0
 */
public interface Iterator<T> {
    boolean hasNext();

    T next();
}
