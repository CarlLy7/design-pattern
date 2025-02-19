package com.geek.designpattern.combinationPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 部门
 * @author: carl
 * @date: 2025.02.19
 */

public class Department extends HumanResource {
    private List<HumanResource> subNodes = new ArrayList<>();

    public Department(long id) {
        super(id);
    }

    public void addHuman(HumanResource hr) {
        subNodes.add(hr);
    }

    @Override
    public double calSalary() {
        for (HumanResource subNode : subNodes) {
            this.salary += subNode.calSalary();
        }
        return salary;
    }
}
