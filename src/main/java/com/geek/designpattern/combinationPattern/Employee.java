package com.geek.designpattern.combinationPattern;

/**
 * 员工
 * @author: carl
 * @date: 2025.02.19
 */

public class Employee extends HumanResource{
    public Employee(long id,double salary) {
        super(id);
        this.salary=salary;
    }

    @Override
    public double calSalary() {
        return this.salary;
    }
}
