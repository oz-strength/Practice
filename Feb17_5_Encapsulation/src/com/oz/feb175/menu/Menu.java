package com.oz.feb175.menu;
public class Menu {
    // 1. 멤버변수 (외부에서 접근 안되도록 'private' !!!)
    private String name;
    private int price;
    // 2. 기본 생성자
    public Menu() {
    }

    // 3. 생성자 오버로딩

    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 4. getter / setter 배치

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // 5. 나머지 메소드...
}
