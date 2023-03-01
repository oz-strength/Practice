package com.oz.march1.quiz2;

import java.util.Random;

public class Brother2 {
    Random r = new Random();

    public int answer(){
        return r.nextInt(3)+1;
    }
}
