package com.oz.feb176.main;

import com.oz.feb176.animal.Animal;
import com.oz.feb176.animal.Bird;

public class AMain1 {
    public static void main(String[] args) {

        // 추상화(Abstraction) : 공통의 속성이나 기능을 묶어서 이름을 붙이는 것
        Bird b = new Bird("호무새", 93, 2);
        b.printInfo();
        b.roar();
        b.bite();
    }
}
