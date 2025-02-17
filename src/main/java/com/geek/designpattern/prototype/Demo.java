package com.geek.designpattern.prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 使用原型模式快速拷贝hashmap中的数据
 * 定时查询新的数据，对老数据集合中数据进行更新或者插入
 * @author: carl
 * @date: 2025.02.17
 */

public class Demo {
    private HashMap<String, SearchWord> currentSearchWord = new HashMap<>();
    private long lastUpdateTime = -1;

    public void refresh() {
        // 先通过clone浅拷贝得到newSearchWord,如果有更新的则先删掉newSearchWord中的引用，然后插入新的
        HashMap<String, SearchWord> newSearchWord = (HashMap<String, SearchWord>) currentSearchWord.clone();
        List<SearchWord> updateSearchWord = getSearchWordByUpdateTime(lastUpdateTime);
        long maxUpdateTime = lastUpdateTime;
        for (SearchWord searchWord : updateSearchWord) {
            if (searchWord.getUpdateTimeStamp() > maxUpdateTime) {
                maxUpdateTime = searchWord.getUpdateTimeStamp();
            }
            if (newSearchWord.containsKey(searchWord.getKeyWord())) {
                newSearchWord.remove(searchWord.getKeyWord());
            }
            newSearchWord.put(searchWord.getKeyWord(), searchWord);
        }
        lastUpdateTime = maxUpdateTime;
    }

    private List<SearchWord> getSearchWordByUpdateTime(long lastUpdateTime) {
        //去数据库查询updateTime > lastUpdateTime的数据
        return new ArrayList<>();
    }

}
