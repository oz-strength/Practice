package com.oz.feb177.main;

import com.oz.feb177.human.Oseungwoo;

public class SMain1 {
    // 원하는 객체 하나 생성
    // 이름, 나이, 별명
    // 출력

    // 디자인 패턴 프로그래밍 중...
    // *** 싱글톤 패턴 (Singleton Pattern)
    // 클래스가 최초 한번만 메모리 할당하고(Static) 그 메모리에 객체를 만들어서 사용하는 디자인 패턴
    // 고정된 메모리 영역을 얻으면서 한번의 new 로 객체를 사용하기 때문에 메모리 낭비를 방지할 수 있음

    public static void main(String[] args) {
//        Oseungwoo oseungwoo = new Oseungwoo("오승우", 31, "oz");
//        oseungwoo.printInfo();
//        System.out.println(oseungwoo);
//        System.out.println("---------");
//        Oseungwoo oseungwoo1 = new Oseungwoo("오승우", 31, "oz");
//        oseungwoo1.printInfo();
//        System.out.println(oseungwoo1);

        // 유일한 객체를 생성하고 싶을때...
        Oseungwoo oseungwoo = Oseungwoo.getOseungwoo();
        oseungwoo.printInfo();
        System.out.println(oseungwoo);
        System.out.println("----------------");
        Oseungwoo oseungwoo2 = Oseungwoo.getOseungwoo();
        oseungwoo2.printInfo();
        System.out.println(oseungwoo2);
    }
}
