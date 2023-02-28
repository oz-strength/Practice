package com.oz.feb28.main;

public class PartTime extends Employee{
    private int payForHour = 8000;

    public PartTime() {
    }

    public PartTime(String name, String departmentName, int hour, int payForHour) {
        super(name, departmentName, hour);
        this.payForHour = payForHour;
    }

    public int getPayForHour() {
        return payForHour;
    }

    public void setPayForHour(int payForHour) {
        this.payForHour = payForHour;
    }
    public void printInfo(){
        System.out.println("이름: " + getName());
        System.out.println("부서이름: " + getDepartmentName());
        System.out.println("근무 시간: " + getHour());
    }
    public int calc(){
        int payment = payForHour * getHour();
        return payment;
    }

}
