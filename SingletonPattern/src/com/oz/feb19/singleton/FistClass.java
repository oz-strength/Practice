package com.oz.feb19.singleton;

public class FistClass {
    public FistClass() {
        // 객체생성을 new로 못하니까 getter로 반환되는 값으로 생성
        // main에서 FirstClss 객체 생성시 실행되게끔 생성자 안에 집어넣기
        SingletonClass singletonClass = SingletonClass.getSingletonClassInstance();
        System.out.println("FirstClass");
        System.out.println("i = " + singletonClass.getI());
        singletonClass.setI(200);
        System.out.println("i = " + singletonClass.getI());

    }

}
