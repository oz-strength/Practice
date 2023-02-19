package com.oz.feb19.singleton;

public class SecondClass {
    public SecondClass() {

        SingletonClass singletonClass = SingletonClass.getSingletonClassInstance();
        System.out.println("SecondClass");
        System.out.println("i = " + singletonClass.getI());


    }
}
