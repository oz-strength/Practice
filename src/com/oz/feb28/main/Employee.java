package com.oz.feb28.main;

public class Employee {
    private String name;
    private String departmentName;
    private int hour;

    public Employee() {
    }

    public Employee(String name, String departmentName, int hour) {
        this.name = name;
        this.departmentName = departmentName;
        this.hour = hour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
