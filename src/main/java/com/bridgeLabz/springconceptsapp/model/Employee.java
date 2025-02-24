package com.bridgeLabz.springconceptsapp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    private String name = "Vinay";
    private final Department department;

    @Autowired
    public Employee(Department department) {
        this.department = department;
    }

    public void showEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        department.showDepartmentDetails();
    }
}
