package com.oz.feb176.avengers;

import com.oz.feb176.Driver;
import com.oz.feb176.Smoker;

public class Ironman extends Avengers implements Smoker, Driver {
    private double property;

    public Ironman() {
    }

    public Ironman(String name, int age, double property) {
        super(name, age);
        this.property = property;
    }

    public double getProperty() {
        return property;
    }

    public void setProperty(double property) {
        this.property = property;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(property);
    }

    @Override
    public void attack() {
        System.out.println("빔 발사!");
    }

    @Override
    public void smoke() {
        System.out.println("뻐끔뻐끔");
    }

    @Override
    public void dirve() {
        System.out.println("부릉~!");
    }
}
