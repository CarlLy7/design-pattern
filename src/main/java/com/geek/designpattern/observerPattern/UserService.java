package com.geek.designpattern.observerPattern;

import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author: carl
 * @date: 2025.02.13
 */
@Service
public class UserService {
    public long register() {
        return Long.parseLong(UUID.randomUUID().toString());
    }
}
