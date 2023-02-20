package com.oz.feb20.main;

import com.oz.feb20.avengers.Ironman;
import com.oz.feb20.human.Human;
import com.oz.feb20.planet.Planet;

public class OMain1 {
    public static void main(String[] args) {
        // 게임 개발 중...
        // 행성(이름, 크기, 보이는지 안보이는지)
        // 사람(이름)
        // 이름이 지구인 행성(행성이름)
        // 이름이 xxx인 사람 생성(사람이름)
        // 이 행성에 사람을 입주

        Planet planet = new Planet("지구");
        Human human = new Human("xxx");
        planet.add(human);

        // 사수 : interface
        // interface 는 부사수제어용
        // attack();을 반드시 구현하게!!
        // 아이언맨 - attack()이 반드시 필요
        // 아이언맨 객체 - attack()기능 구현
        Ironman i = new Ironman();
        // 이 사람이 아이언맨을 자신의 전담영웅으로 픽
        human.pick(i);
        // 이 사람이 도와달라고 소리침! => 아이언맨이 공격을 해줌
        human.help();
        // 이 행성 사이즈를 1000으로 수정
        planet.setSize(1000);
        // 이 행성을 보이게 수정
        planet.setVisible(true);

    }
}
