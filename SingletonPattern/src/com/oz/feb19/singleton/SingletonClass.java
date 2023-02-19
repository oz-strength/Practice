package com.oz.feb19.singleton;

public class SingletonClass {

    // static으로 만들어서 객체가 생성되기 전인 클래스 영역에서 자기자신의 객체를 생성
    private static SingletonClass SINGLETON_CLASS_INSTANCE = new SingletonClass();
    public int i = 10;

    public SingletonClass() {
    }

    public static SingletonClass getSingletonClassInstance() {
        // 처음 생성될 때 값이 없으면 새로운 SingletonClass 객체를 만들지만 값이 생긴 다음부터는 생긴 객체를 계속 유지
        if(SINGLETON_CLASS_INSTANCE == null) {
            SINGLETON_CLASS_INSTANCE = new SingletonClass();
        }

        return SINGLETON_CLASS_INSTANCE;
    }

    public int getI(){
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
