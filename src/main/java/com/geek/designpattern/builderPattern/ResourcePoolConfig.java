package com.geek.designpattern.builderPattern;

import org.springframework.util.StringUtils;

/**
 * 建造者模式
 * @author: carl
 * @date: 2025.02.17
 */

public class ResourcePoolConfig {
    private String name;
    private int maxTotal;
    private int maxIdle;
    private int midIdle;

    public String getName() {
        return name;
    }

    public int getMaxTotal() {
        return maxTotal;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public int getMidIdle() {
        return midIdle;
    }

    public ResourcePoolConfig(Builder builder) {
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
        this.maxIdle = builder.maxIdle;
        this.midIdle = builder.midIdle;
    }

    // 静态内部类建造者
    public static class Builder {
        private String name;
        private int maxTotal = 8;
        private int maxIdle = 0;
        private int midIdle = 0;

        public ResourcePoolConfig build() {
            if (!StringUtils.hasLength(name)) {
                throw new RuntimeException("name is can't be empty!");
            }
            if (maxIdle > maxTotal) {
                throw new IllegalArgumentException("maxIdle is not bigger than maxTotal!");
            }
            if (midIdle < 0) {
                throw new IllegalArgumentException("midIdle is not smaller than 0 !");
            }
            return new ResourcePoolConfig(this);
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setMaxTotal(int maxTotal) {
            this.maxTotal = maxTotal;
        }

        public void setMaxIdle(int maxIdle) {
            this.maxIdle = maxIdle;
        }

        public void setMidIdle(int midIdle) {
            this.midIdle = midIdle;
        }
    }
}
