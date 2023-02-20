package com.oz.feb20.human;

import com.beaver.feb201.avengers.Avengers;
import com.oz.feb20.avengers.Ironman;

public class Human {
    // 사람(이름)
    String name;
    private Avengers hero;  // 클래스나 인터페이스를 타입으로 하는 변수를 가져오는것이 아직 어색한듯 하다
    public Human() {
    }

    public Human(String name) {
        this.name = name;
        System.out.println(name + "탄생!!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void pick(Avengers a) {
        hero = a;
        System.out.println("ironman arrived");
    }

    public void help(){
        System.out.println("help~~!");
        hero.attack();
    }

}
