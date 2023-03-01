package com.oz.march1.quiz;

import java.sql.SQLOutput;

// 심판 / 친구 / 나
// 주도적인물 : 심판
// 등장인물 모두 등장
// 심판과 친구는 나와있고 -> 심판이 나를 불러내는 상황
// 심판 => 친구 답 요구 : 종이에 답을 적어서 제출 (숫자)
// 심판 => 나의 답 요구 : 말로 대답
// 판정
// 맞출때까지 진행 => 몇번째 시도만에 정답을 맞췄는지 출력
public class Judge {
    public Me callMe(){
        System.out.println("심판 : 플레이어 나오세요\n");
        System.out.println("나 : 네 ~ 나왔습니다." );
        return new Me();
    }

    public int askFriAns(Friend f){
        System.out.println("심판 : 친구는 답을 제출하세요 ");
        int friAns = f.FriendAns();
        return friAns;
    }

    public int askPlayer(Me mm){
        System.out.println("심판 : 플레이어는 답을 제출하세요: ");
        int playerAns = mm.answer();
        if (playerAns < 1 || playerAns > 100) {
            System.out.println("다시 제출하세요!( 1 ~ 100) : ");
        }
        return playerAns >= 1 && playerAns <= 100 ? playerAns : askPlayer(mm);
    }

    public boolean compare(int friAns, int myAns){
        if(friAns == myAns) {
            System.out.println("정답!!");
        } else if(friAns > myAns) {
            System.out.println("UP!");
        } else {
            System.out.println("DOWN!");
        }
        return friAns == myAns;
    }

    public void countTry(int count){
        System.out.printf("지금까지 시도한 횟수: %d", count);
    }

    public void startGame(Friend f){
        int count = 0;
        Me mm = callMe();
        int friAns = askFriAns(f);
        int myAns = 0; // 변수 선언은 반복문 밖에서
        boolean isEndGame = false;
        while(true) {
            count++;
            myAns = askPlayer(mm); // 틀렸을 경우 답을 계속 요구하기 위해 반복문 안쪽에서 메소드 실행 및 값을 반환받기
            isEndGame = compare(friAns, myAns); // 정답일때만 불리언 타입의 반환값을 받아서 isEndGame에 저장
            if(isEndGame){  // 정답일때(true) 카운트 세고 반복문 종료
                countTry(count);
                break;
            }
        }
    }
}
