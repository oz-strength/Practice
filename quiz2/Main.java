package com.oz.march1.quiz2;

public class Main {
    public static void main(String[] args) {
        Brother1 b1 = new Brother1();
        Brother2 b2 = new Brother2();
        Judge j = new Judge();
        j.gameStart(b1, b2);
    }
}
