package com.oz.feb217.main;

public class Product {
    String name;
    int price;

    public Product() {
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void printInfo(){
        System.out.println(name);
        System.out.println(price);
    }

}
