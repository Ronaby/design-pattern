package com.ronbay.desigin.module.flyweight.demo01;

/**
 * @Description: 棋子
 * @Author
 * @Date 2023/3/17
 * @Version 1.0
 */
public class ChessPiece {
    private ChessPieceUnit chessPieceUnit;

    private int positionX;

    private int positionY;

    public ChessPiece(ChessPieceUnit chessPieceUnit, int positionX, int positionY) {
        this.chessPieceUnit = chessPieceUnit;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public ChessPieceUnit getChessPieceUnit() {
        return chessPieceUnit;
    }

    public void setChessPieceUnit(ChessPieceUnit chessPieceUnit) {
        this.chessPieceUnit = chessPieceUnit;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
}
