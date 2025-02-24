package com.geek.designpattern.prototypePattern;

/**
 * @author: carl
 * @date: 2025.02.17
 */

public class SearchWord {
    private String keyWord;
    private int count;

    private long updateTimeStamp;

    public SearchWord(String keyWord, int count, long updateTimeStamp) {
        this.keyWord = keyWord;
        this.count = count;
        this.updateTimeStamp = updateTimeStamp;
    }

    public SearchWord() {
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public long getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    public void setUpdateTimeStamp(long updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
    }

    @Override
    public String toString() {
        return "SearchWord{" +
                "keyWord='" + keyWord + '\'' +
                ", count=" + count +
                ", updateTimeStamp=" + updateTimeStamp +
                '}';
    }
}
