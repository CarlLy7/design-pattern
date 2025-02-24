package com.geek.designpattern.flyweightPattern;

/**
 * 象棋类
 * @author: carl
 * @date: 2025.02.24
 */

public class ChessPiece {
    private ChessPieceUnit unit;
    private int positionX;
    private int positionY;

    public ChessPiece(ChessPieceUnit unit, int positionX, int positionY) {
        this.unit = unit;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public ChessPieceUnit getUnit() {
        return unit;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setUnit(ChessPieceUnit unit) {
        this.unit = unit;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    @Override
    public String toString() {
        return "ChessPiece{" +
                "unit=" + unit +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}
