package com.oz.feb176.bite;

// 클래스 : 멤버변수, 메소드
// 추상클래스 : 멤버변수, 메소드, 추상메소드
// 인터페이스 : 추상메소드, 멤버 상수
//          => 객체생성 불가능!
public interface Bite {
//    private int a; // 멤버변수 불가능!
    public static final int B = 3; // 멤버 상수 가능!

    //    public void c(){
//        System.out.println("c");
//    } // 메소드 불가능!
    public abstract void bite();
}
