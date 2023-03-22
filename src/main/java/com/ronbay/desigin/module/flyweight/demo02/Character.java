package com.ronbay.desigin.module.flyweight.demo02;

import javafx.scene.text.Font;

/**
 * @Description: 文字
 * @Author
 * @Date 2023/3/17
 * @Version 1.0
 */
public class Character {

    private char c;

    private Font font;
    private int size;

    private int colorRGB;

    public Character(char c, Font font, int size, int colorRGB) {
        this.c = c;
        this.font = font;
        this.size = size;
        this.colorRGB = colorRGB;
    }
}
