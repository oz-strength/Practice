package com.oz.feb202.practice;

import javax.swing.*;
import java.awt.*;

public class JframePractice {
    // JFrame : Swing 에서 윈도우를 나타내는 Class
//      JPanel(보조 프레임), JButton(버튼), JLabel(라벨), JTextField(글자입력)...
// layout :
//          flowLayout - 일렬배치 (왼쪽 -> 오른쪽)
//          BorderLayout - Frame 형식
//          GridLayout - 격자 형태
//          setLocation, setBounds - 위치 임의로 지정
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        JPanel jp = new JPanel();
        JLabel jl = new JLabel();
        JTextField jt = new JTextField();

        JButton bt1 = new JButton("버튼 1");
        JButton bt2 = new JButton("버튼 2");
        JButton bt3 = new JButton("버튼 3");
        JButton bt4 = new JButton("버튼 4");
        jf.setTitle("GUI 연습하기~");
        jf.setSize(500,500);
        jf.setVisible(true);


        jp.setLayout(new GridLayout(2,2));
        jp.add(bt1);
//        jp.add(new JTextField(""));
        jp.add(new JLabel("EMPTY SPACE"));
        jp.add(bt2);
        jp.add(bt3);

//        jp.add(new JTextField(""));

        jf.add(jp);






    }
}
