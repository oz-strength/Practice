package com.oz.feb141.oop;

import java.util.Scanner;

public class Guest {

    double height;
    double weight;
    Scanner k = new Scanner(System.in);
    public double answerHeight(){
        height = k.nextDouble();
        System.out.printf("제 키는: %.2f 입니다. \n", height);
        return height;
    }

    public double answerWeight(){
        weight = k.nextDouble();
        System.out.printf("제 몸무게는: %.2f 입니다. \n", weight);
        return weight;
    }

}
