package com.oz.feb28.main;

public class Main1 {
    public static void main(String[] args) {
        FullTime fullTime = new FullTime("아리", "IT부서", 30, 10000);

        fullTime.printInfo();
        System.out.println("----------------");
        int payment = fullTime.calc();
        System.out.printf("%s가 받을 급여는 : %,d원\n", fullTime.getName(), payment);
        System.out.println("================================");
        PartTime partTime = new PartTime("제이스", "인사부서", 40, 8000);

        partTime.printInfo();
        System.out.println("--------------------");
        int payment2 = partTime.calc();
        System.out.printf("%s가 받을 급여는 : %,d원", partTime.getName(), payment2);


    }
}
