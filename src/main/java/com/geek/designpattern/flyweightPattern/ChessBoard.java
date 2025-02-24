package com.geek.designpattern.flyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 棋局类
 * 这样我们哪怕有100w的棋局，但是依然只会创建出特定数量的象棋享元对象，这样我们所有的象棋可以复用这些特定数量的享元对象，从而达到节省内存的目的
 *
 * @author: carl
 * @date: 2025.02.24
 */

public class ChessBoard {
    private Map<Integer, ChessPiece> chessPieces = new HashMap<>();

    public ChessBoard() {
        init();
    }

    private void init() {
        chessPieces.put(1, new ChessPiece(ChessPieceFactory.getPiece(1), 1, 1));
        chessPieces.put(2, new ChessPiece(ChessPieceFactory.getPiece(2), 2, 2));
        //...省略其他的象棋初始位置
    }

    public void move(int chessPieceId, int toPositionX, int toPositionY) {
        //省略移动
    }
}
