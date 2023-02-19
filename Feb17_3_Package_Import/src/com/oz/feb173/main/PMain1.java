package com.oz.feb173.main;

 // PMain1.java에서 쓰는  Scanner는 무조건 이것만 사용하겠다라는 뜻
import com.oz.feb173.machine.Scanner;

public class PMain1 {
    public static void main(String[] args) {
        // 객체 만들 때 패키지명을 생략가능한 경우
        //      자바 기본 패키지(java.lang) 소속

        // 같은 패키지 소속
        com.oz.feb173.main.Oz o = new com.oz.feb173.main.Oz();
        Oz o1 = new Oz();

        // 다른 패키지 소속
        com.oz.feb173.machine.Scanner s = new com.oz.feb173.machine.Scanner();
        Scanner s2 = new Scanner(); // import

    }
}
