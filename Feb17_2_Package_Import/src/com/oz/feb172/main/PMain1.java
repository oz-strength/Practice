package com.oz.feb172.main;

import com.oz.feb172.product.Computer;
import com.oz.feb172.product.Scanner;

public class PMain1 {
    public static void main(String[] args) {
        // 매직 스테이션, 80만원, i5-1234, 8GB, 500GB
        // 출력
        Computer computer = new Computer("매직스테이션", 800000, "i5-1234", 8, 500);
        computer.printInfo();
        System.out.println("---------------");

        // 멀티익스프레스, 50만원, 스캐너
        // 출력
        // import 하지 않고 직접 입력하는 방법도 있다
        com.oz.feb172.product.Scanner s = new com.oz.feb172.product.Scanner("멀티익스프레스", 500000);
        s.printInfo();
    }
}
