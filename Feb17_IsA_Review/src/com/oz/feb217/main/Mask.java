package com.oz.feb217.main;
// Mask is a Product
public class Mask extends Product{
    public Mask() {
    }

    public Mask(String name, int price) { // 이클립스는 필드에 변수가 없어서 생성이 자동으로 안되는데 인텔리제이는 자동완성이 가능하다
        super(name, price);
    }
}
