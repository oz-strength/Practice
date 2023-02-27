package com.oz.feb141.oop;

public class Doctor {
    // BMI : 몸무게 / 키 * 키 => 키 : m단위
    // 18.5 미만 : 저체중
    // 18.5 이상 : 정상
    // 25 이상 : 과체중
    // 30 이상 : 경도비만
    // 35 이상 : 중증도비만
    // 40 이상 : 고도 비만

    // 손님 부르기
    // 키묻기
    // 몸무게 묻기
    // bmi계산
    // 판정해서 결과내기
    // 결과 알려주기
    // 위의 과정을 실행할 부분
    //
     Guest g = new Guest();
    public void callGuest(){
        System.out.println("손님 들어오세요~");
    }

    public void askHeight(){
        System.out.print("키가 몇이세요?: ");
        g.answerHeight();
    }

    public void askWeight(){
        System.out.print("몸무게는 몇이세요?: ");
        g.answerWeight();
    }

    public void calculateBmi(double height,double weight){
        double bmi = weight / (height/100 * height/100);
        System.out.println("손님은 현재 ");
        if(bmi < 18.5) {
            System.out.println("저체중입니다.");
        } else if (bmi >= 18.5) {
            System.out.println("정상입니다.");
        } else if (bmi >= 25) {
            System.out.println("과체중입니다.");
        } else if (bmi >= 30) {
            System.out.println("경도비만입니다.");
        } else if (bmi >= 35) {
            System.out.println("중증도비만입니다.");
        } else if (bmi >= 40) {
            System.out.println("고도비만입니다.");
        }
    }
    public void examination(){
        callGuest();
        askHeight();
        askWeight();
        calculateBmi(g.height,g.weight);
    }



}
