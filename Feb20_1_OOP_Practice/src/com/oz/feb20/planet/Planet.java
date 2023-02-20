package com.oz.feb20.planet;

import com.oz.feb20.human.Human;

public class Planet {
    // 행성(이름, 크기, 보이는지 안보이는지)
    private String name;
    private double size;
    private boolean visible;

    public Planet() {
    }

    public Planet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void add(Human h){  // Human 클래스의 참조변수 h를 매개변수로 하여 Human 클래스 안의 getName메소드를 가져왔다 
        System.out.printf("%s에 %s이/가 입주!~~\n", name, h.getName());
    }
}
