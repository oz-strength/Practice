package com.oz.feb174.main;

import com.oz.feb174.dog.Dog;

// 다른 패키지임과 동싱 하위 클래스
public class AMain1 extends Dog {
    public static void main(String[] args) {
        Dog dog = new Dog();

//        dog.a = 1;      // a : public
//        dog.b = 2;      // b : protected => Java의 버그다.. 정도..! 알고있자
//        dog.c = 3;      // c : default
//        dog.d = 4;      // d : private

        // 자바의 정석 책에보면 protected는 같은 패키지이거나 다른패키지의 하위 클래스에서 사용가능하다고 나와있지만
        // 실제로는 그렇지 않다..!
        // 우리는 주로 public & private을 사용한다.
    }
}
