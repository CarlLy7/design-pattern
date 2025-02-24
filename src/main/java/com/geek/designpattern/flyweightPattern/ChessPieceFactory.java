package com.geek.designpattern.flyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式一般需要和工厂模式配合使用，这个就是创建享元对象的工厂类
 *
 * @author: carl
 * @date: 2025.02.24
 */

public class ChessPieceFactory {
    private static Map<Integer, ChessPieceUnit> cache = new HashMap<>();

    //类加载的时候就一次性将所有的享元对象创建出来放到内存中
    static {
        cache.put(1, new ChessPieceUnit(1, "将", ChessPieceUnit.Color.BLACK));
        cache.put(2, new ChessPieceUnit(2, "車", ChessPieceUnit.Color.BLACK));
        //...
    }

    public static ChessPieceUnit getPiece(int id) {
        return cache.get(id);
    }
}
