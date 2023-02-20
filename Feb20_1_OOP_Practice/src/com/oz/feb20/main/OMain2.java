package com.oz.feb20.main;

import com.oz.feb20.avengers.Hulk;

import javax.swing.*;

// Java GUI 프로그램 (Graphic User Interface)
// AWT, Swing, JavaFX

// AWT : 자바 초창기에 나온 GUI 라이브러리
//       운영체제(OS)에 따라서 모양이 다달랐기 때문에 , 종류도 상당히 제한적
// Swing : AWT 다음으로 나온 라이브러리
//      윈도우 프로그램 - 자바 X : 느림, 더 최적화가 된 C가있음
//      윈도우 프로그램 잘 안만듦... -> 웹/앱쪽으로 넘어가는추세
//      -결론적으로는 별로!, 디자인도 별로!
//      - Android App 구조 이해하는데는 도움이 됨
// JavaFX : Swign 의 느린 처리속도를 개선하기 위해 출시
//      다양한 기능들이 추가 + 따로 외관을 꾸미는 것도 가능해짐
//      여전히 웹/앱쪽에서 구현을 하면 되기 때문에 그다지...


public class OMain2 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("지구");
        JButton jb = new JButton("김비버");
        jf.add(jb);

        // 헐크 - actinPerformed()가 반드시 필요
        //          (미완성된 메소드)
        // 헐크 생성
        Hulk h = new Hulk();

        // 김비버가 전담영웅으로 헐크를 골랐음
        // 도움을 요철
        jb.addActionListener(h);

        // 크기, 눈에 보이게
        jf.setSize(500, 500);
        jf.setVisible(true);
    }
}
