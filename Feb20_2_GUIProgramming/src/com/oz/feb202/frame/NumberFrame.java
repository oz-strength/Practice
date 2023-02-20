package com.oz.feb202.frame;


// JFrame 생성 (500, 500)
// JPanel 안에 1~30까지의 숫자가 랜덤한 위치에 나오게

// 숫자 여러개 뽑을 때 => 반복문
// array []

// 글자가 표현되게 하려면 => JLabel 을 이용

import javax.swing.*;
import java.awt.*;
import java.util.Random;

// set~
// 배경색도 바꾸고
// 글자색도 바꾸고
// Color.xxx
public class NumberFrame extends JFrame {
    JPanel p = new JPanel();
    JLabel[] l = new JLabel[30];
    public NumberFrame() {

        p.setLayout(null);
        p.setBackground(Color.cyan);
        Random r = new Random();
        int x = 0;
        int y = 0;

        for (int i = 0; i < 30; i++) {
            l[i] = new JLabel("" + (i + 1));
            x = r.nextInt(501);        // 숫자는 그냥 반복문 순서대로 만들고, 나오는 위치를 랜덤하게 하기
            y = r.nextInt(501);
            l[i].setForeground(Color.pink);
            l[i].setLocation(x, y);
            l[i].setSize(50, 50);

            p.add(l[i]);
        }
        add(p);
        setTitle("랜덤 숫자 생성!");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

