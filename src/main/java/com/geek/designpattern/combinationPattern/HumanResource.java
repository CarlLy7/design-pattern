package com.geek.designpattern.combinationPattern;

/**
 * 员工和部门的抽象父类
 * @author: carl
 * @date: 2025.02.19
 */

public abstract class HumanResource {
    protected long id;
    protected double salary;

    public HumanResource(long id){
        this.id=id;
    }

    public long getId() {
        return id;
    }

    public abstract double calSalary();

}
