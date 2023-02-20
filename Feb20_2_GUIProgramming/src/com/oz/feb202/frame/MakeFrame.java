package com.oz.feb202.frame;


// JFrame : Swing 에서 윈도우를 나타내는 Class
//      JPanel(보조 프레임), JButton(버튼), JLabel(라벨), JTextField(글자입력)...
// layout :
//          flowLayout - 일렬배치 (왼쪽 -> 오른쪽)
//          BorderLayout - Frame 형식
//          GridLayout - 격자 형태
//          setLocation, setBounds - 위치 임의로 지정

import javax.swing.*;
import java.awt.*;

// 버튼 10개 번호 붙여서 (1~10) 일렬배치(왼쪽 -> 오른쪽)
public class MakeFrame extends JFrame {
    JPanel pl; // 나눠서 하는 이유가 뭔지 ?

    public MakeFrame() {
//        setSize(500, 500);
//        setLocationRelativeTo(null);
//
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        setLayout(new FlowLayout(FlowLayout.LEFT));
////        JButton btn1 = new JButton("버튼 1");
//        JButton btn[] = new JButton[10];
//        for (int i = 0; i < 10; i++) {
//            btn[i] = new JButton("버튼" + i);
//            add(btn[i]);
//        }
//
//
//        setVisible(true);
//    }
//
        setSize(500, 500);
        setTitle("GUI 연습");
        pl = new JPanel();
        pl.setLayout(new FlowLayout());
        for (int i = 0; i < 10; i++) {
            pl.add(new JButton("버튼" + i));
        }
        add(pl);
        setVisible(true);


    }
}
