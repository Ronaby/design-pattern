package com.ronbay.desigin.module.flyweight.demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:  享元的工厂类
 * @Author
 * @Date 2023/3/17
 * @Version 1.0
 */
public class ChessPieceUnitFactory {

    private static final Map<Integer, ChessPieceUnit> pieces = new HashMap<>();

    static {
        pieces.put(1,new ChessPieceUnit(1,"车",ChessPieceUnit.Color.BLACK));
        pieces.put(2,new ChessPieceUnit(1,"马",ChessPieceUnit.Color.RED));

    }

    public static ChessPieceUnit getChessPiece(int chessPieceId){
        return pieces.get(chessPieceId);
    }
}
