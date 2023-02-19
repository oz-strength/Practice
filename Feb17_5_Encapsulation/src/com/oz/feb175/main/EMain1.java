package com.oz.feb175.main;

import com.oz.feb175.coffee.Coffee;
import com.oz.feb175.human.Human;

import javax.swing.*;

public class EMain1 {

    public static void main(String[] args) {
        // 타이틀이 ㅋㅋㅋ 인 JFrame
//        JFrame f = new JFrame();
//
//        // 뭔가를 수정할 때 set을 기억하자 !
//        // 사이즈를 300, 500 수정
//        f.setSize(300,500);
//
//        // 타이틀을 ㅎㅎㅎ로 수정
//        f.setTitle("ㅎㅎㅎ");
//        // 보이게 하고 싶음
////        f.show(); 곧 사라질지도 모르는 녀석
//        f.setVisible(true);

        // 커피...
        // 이름이 아메리카노, 가격 3000원
        // 출력
        Coffee c = new Coffee("아메리카노", 3000);
        c.printInfo();
        System.out.println("-------------");

        // 사람
        // 이름, 나이, 몸무게
        // 출력
        Human h = new Human();
        h.setName("김비버");
        h.setAge(-23);
        System.out.println(h.getAge());

        // set 으로 불러오지 않으면 set메소드가 실행이 안된다
        Human h2 = new Human("dskl", -123);
        System.out.println(h2.getAge());
    }
}
