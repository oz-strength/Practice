package com.oz.feb178.register;

// 공장 역할을 할 클래스
public class Academy {
    private int studentCount;

    // 학생 객체 만들 때 사용할 메소드
    public Student consult(String name, int age) {
        studentCount++;
        Student s = new Student(studentCount, name, age);
        return s;
    }
}
