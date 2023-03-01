package com.oz.march1.quiz1;

public class Main {
    // 홀짝 맞추기
    // 컴퓨터 vs 유저
    // 시작
    // 컴퓨터가 동전을 가지고 있고 (20개)
    // 컴퓨터가 유저한테 동전 중에서 몇 개로 시작할 지 물어보고
    // 유저가 답 하고 (동전갯수)
    // 컴퓨터가 짤짤이 해서
    // 유저한테 홀 / 짝 물어보고
    // 판정

    public static void main(String[] args) {
        Computer c = new Computer();
        User u = new User();
        c.startGame(u);
    }
}