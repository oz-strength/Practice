package com.oz.feb176.animal;

import com.oz.feb176.bite.Bite;

// 클래스끼리는 다중상속 X (1대 1로만)
// 클래스 + 인터페이스는 다중상속 O

public class Bird extends Animal implements Bite /* , Fly, Eat,...*/ {
    private int leg;

    public Bird() {
    }

    public Bird(String sort, int age, int leg) {
        super(sort, age);
        this.leg = leg;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(leg);
    }

    @Override
    public void roar() {
        System.out.println("짹짹!!");
    }

    @Override
    public void bite() {
        System.out.println("새는 부리로 찢어!");
    }
}
