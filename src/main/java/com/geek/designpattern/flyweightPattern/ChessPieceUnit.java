package com.geek.designpattern.flyweightPattern;

/**
 * 象棋类共享对象
 *
 * @author: carl
 * @date: 2025.02.24
 */

public class ChessPieceUnit {
    /**
     * 象棋id
     */
    private int id;

    /**
     * 象棋文字
     */
    private String text;

    /**
     *象棋颜色
     */
    private Color color;

    public static enum Color {
        RED, BLACK;
    }

    public ChessPieceUnit(int id, String text, Color color) {
        this.id = id;
        this.text = text;
        this.color = color;
    }
}

