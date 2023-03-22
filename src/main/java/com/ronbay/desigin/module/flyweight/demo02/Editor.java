package com.ronbay.desigin.module.flyweight.demo02;

import javafx.scene.text.Font;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author
 * @Date 2023/3/17
 * @Version 1.0
 */
public class Editor {
    private List<Character> chars = new ArrayList<>();

    public void appendCharacter(char c, Font font, int size, int colorRGB){
        Character character = new Character(c,font,size,colorRGB);
        chars.add(character);
    }
}
