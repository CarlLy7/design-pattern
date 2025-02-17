package com.geek.designpattern.factoryPattern.simpleFactory;

/**
 * @author: carl
 * @date: 2025.02.17
 */

public class JsonRuleConfigParser implements IRuleConfigParser{
    @Override
    public void parser(String str) {
        System.out.println("json");
    }
}
