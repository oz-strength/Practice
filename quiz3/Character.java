package com.oz.march1.quiz3;

public class Character {
    String nickName;
    int level = 10;
    String job = "전사";
    String weapon = "몽둥이";

    public Character() {
    }

    public Character(String nickName) {
        this.nickName = nickName;
    }

    public void printInfo(){
        System.out.printf("이름: %s\n", nickName);
        System.out.printf("레벨: %d\n", level);
        System.out.printf("직업: %s\n", job);
        System.out.printf("무기: %s\n", weapon);
    }
}
