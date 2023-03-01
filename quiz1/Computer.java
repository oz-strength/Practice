package com.oz.march1.quiz1;

import java.util.Random;

// 시작
// 컴퓨터가 동전을 가지고 있고 (20개)
// 컴퓨터가 유저한테 동전 중에서 몇 개로 시작할 지 물어보고
// 유저가 답 하고 (동전갯수)
// 컴퓨터가 짤짤이 해서
// 유저한테 홀 / 짝 물어보고
// 판정
public class Computer {
    int coin = 20;

    public int askHowManyCoin(User u){
        System.out.println("몇개로 할래? (1~20개) : ");
        int userCoin = u.ansHowManyCoin();
        if(userCoin < 1 || userCoin > 20) {
            System.out.println("다시 입력하세요");
        }
        return (userCoin >= 1 && userCoin <=20) ? userCoin : askHowManyCoin(u);
    }

    public int shakeCoin(int userCoin){
        Random r = new Random();
        int comCoin = r.nextInt(userCoin)+1;
        return comCoin;
    }

    public String askHJ(User u){
        System.out.println("홀 짝?: ");
//        return (u.ansEvenOdd().equals("홀") || u.ansEvenOdd().equals("짝") ? u.ansEvenOdd() : askHJ(u)); // 이렇게 쓰면 ansEvenOdd() 메소드가 두번씩 호출되서 답을 2번 해야되는 상황이 나옴
        String userAns = u.ansEvenOdd();
        return (userAns.equals("홀") || userAns.equals("짝") ? userAns : askHJ(u));
    }

    public String comAns(int comCoin) {
        return comCoin % 2 == 0 ? "짝" : "홀";
    }

    public void judge(String userAns, String comAns, int comCoin) {
        if (userAns.equals(comAns)) {
            System.out.printf("컴퓨터가 %d개 가지고 있으므로 정답!", comCoin);
        } else {
            System.out.printf("컴퓨터가 %d개 가지고 있으므로 땡!", comCoin);
        }
    }

    public void startGame(User u){
        int userCoin = askHowManyCoin(u);
        int comCoin = shakeCoin(userCoin);
        String userAns = askHJ(u);
        String comAns = comAns(comCoin);
        judge(userAns, comAns, comCoin);
    }

}