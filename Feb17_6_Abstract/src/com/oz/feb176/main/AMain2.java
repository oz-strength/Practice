package com.oz.feb176.main;

import com.oz.feb176.avengers.Avengers;
import com.oz.feb176.avengers.Ironman;

public class AMain2 {

    // 어벤져스 클래스
    // 이름, 나이 속성
    // 속성 출력 기능
    // 공격하기 기능
    public static void main(String[] args) {
        // Avengers 로부터 상속받은...
        // 클래스명은 모름
        // 내부에 만들어 놓은 클래스
        // 단 한 번만 사용될 수 있고, 오직 하나의 객체만을 사용할 수 있는 1회용 클래스
        // => 다른곳에서 불러올 수 없음

        // 익명 내부 클래스(anomy inner class)
        Avengers a = new Avengers("파커",18) { // 중괄호 안쪽 부분이 클래스 부분
            @Override
            public void attack() {
                System.out.println("거미줄 발사 !");
            }
        };
        a.printInfo();
        a.attack();

        System.out.println("------------");
        // 아이언맨은 어벤져스
        // 속성으로 재산
        // 공격은 빔
        // 흡연 O
        // 운전 O
        Ironman ironman = new Ironman("토니스타크", 40, 123123);
        ironman.printInfo();
        ironman.attack();
        ironman.dirve();
        ironman.smoke();

        // 다형성 (Polymorphism)
        // Poly (많은) + Morph (모양)
        // 같은 형태이지만 다른 기능할 수 있는...!(overriding과 밀접한 관련)


    }
}
