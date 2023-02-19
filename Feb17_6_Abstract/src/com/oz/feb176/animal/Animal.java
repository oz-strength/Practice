package com.oz.feb176.animal;

public abstract class Animal{
    private String sort;
    private int age;

    public Animal() {
    }

    public Animal(String sort, int age) {
        this.sort = sort;
        this.age = age;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo(){
        System.out.println(sort);
        System.out.println(age);
    }

    // abstract 메소드 : 미완성된 메소드(내용이 없는)
    // 하위클래스에서 반드시!!! 오버라이딩해서 사용해야!!!

    // abstract 메소드가 하나라도 있으면
    // abstract 클래스 or interface 여야 한다!!
    public abstract void roar();

}
