package com.oz.feb177.human;

public class Oseungwoo {
    private String name;
    private int age;
    private String nickName;

    private static final Oseungwoo OSEUNGWOO = new Oseungwoo("오승우", 31, "oz");
    public Oseungwoo() {
    }

    public Oseungwoo(String name, int age, String nickName) {
        this.name = name;
        this.age = age;
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public static Oseungwoo getOseungwoo(){
        return OSEUNGWOO;
    }
    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(nickName);
    }
}
