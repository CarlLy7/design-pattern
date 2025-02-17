package com.geek.designpattern.factoryPattern.simpleFactory;

/**
 * 简单工厂
 *
 * @author: carl
 * @date: 2025.02.17
 */

public class RuleConfigParserFactory {
    public static IRuleConfigParser createRuleConfigParser(String format) {
        IRuleConfigParser result = null;
        if ("yaml".equals(format)) {
            result = new YamlRuleConfigParser();
        } else if ("xml".equals(format)) {
            result = new XmlRuleConfigParser();
        } else if ("json".equals(format)) {
            result = new JsonRuleConfigParser();
        }
        return result;
    }

}
