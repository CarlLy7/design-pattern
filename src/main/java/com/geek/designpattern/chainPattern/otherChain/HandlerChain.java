package com.geek.designpattern.chainPattern.otherChain;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 职责链类
 * @author: carl
 * @date: 2025.02.26
 */

public class HandlerChain {
    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        this.handlers.add(handler);
    }

    /**
     * 随机处理
     */
    public void doHandle() {
        if (!CollectionUtils.isEmpty(handlers)) {
            for (IHandler handler : handlers) {
                boolean isNextHandle = handler.handle();
                if (!isNextHandle) {
                    break;
                }
            }
        }
    }
}
