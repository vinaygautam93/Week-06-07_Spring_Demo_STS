package com.bridgeLabz.springconceptsapp.service;

import org.springframework.stereotype.Component;

@Component
public class Department {
    private String deptName = "Development";

    public void showDepartmentDetails() {
        System.out.println("Department Name: " + deptName);
    }
}
