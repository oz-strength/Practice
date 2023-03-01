package com.oz.march1.quiz1;

import java.util.Scanner;

public class User {
    Scanner mouth = new Scanner(System.in);
    public int ansHowManyCoin(){
        return mouth.nextInt();
    }

    public String ansEvenOdd(){
        return mouth.next();
    }
}
