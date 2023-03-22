package com.ronbay.desigin.module.flyweight.demo01;


import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @Description: 享元类
 * @Author
 * @Date 2023/3/17
 * @Version 1.0
 */
public class ChessPieceUnit {
    private int id;

    private String text;

    private Color color;

    public ChessPieceUnit(int id, String text, Color color) {
        this.id = id;
        this.text = text;
        this.color = color;
    }

    public static enum Color{
        RED,BLACK
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Color getColor() {
        return color;
    }
}
