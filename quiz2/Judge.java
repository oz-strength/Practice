package com.oz.march1.quiz2;
// 다같이 한자리에 있음
// 심판한테 룰북이 존재
// 룰북 : 1은 가위 2는 바위 3은 보
// 한판 질 동안 몇승 몇무 했는지 출력
public class Judge {

    public void start(){
        System.out.println("게임을 시작합니다!");
        System.out.println("1 : 가위 || 2 : 바위 || 3 : 보");
    }

    public int askBro2(Brother2 b2){
        System.out.println("동생 2는 하나를 선택합니다...");
        int bro2Ans = b2.answer();

        return bro2Ans;
    }

    public int askBro1(Brother1 b1) {
        System.out.println("동생 1은 하나를 선택하세요: ");
        int b1Ans = b1.answer();
        if (b1Ans < 1 || b1Ans > 3) {
            System.out.println("다시 입력하세요!!");
        }
        if(b1Ans == 1) {
            System.out.println("동생 1: 가위");
        }else if (b1Ans == 2) {
            System.out.println("동생 1: 바위");
        }else {
            System.out.println("동생 1: 보");
        }
        return b1Ans >=1 && b1Ans <=3 ? b1Ans : askBro1(b1);
    }
    public boolean judge(int b1Ans, int b2Ans){
        if (b1Ans == b2Ans) {
            if(b2Ans == 1) {
                System.out.println("동생 2 : 가위");
            }else if(b2Ans == 2) {
                System.out.println("동생 2 : 바위");
            }else {
                System.out.println("동생 2 : 보");
            }
            System.out.println("비겼습니다!");
        } else if(b2Ans == b1Ans +1 || b1Ans == b2Ans + 2) {
            if(b2Ans == 1) {
                System.out.println("동생 2 : 가위");
            }else if(b2Ans == 2) {
                System.out.println("동생 2 : 바위");
            }else {
                System.out.println("동생 2 : 보");
            }
            System.out.println("동생 2의 승리!!");
        } else {
            if(b2Ans == 1) {
                System.out.println("동생 2 : 가위");
            }else if(b2Ans == 2) {
                System.out.println("동생 2 : 바위");
            }else {
                System.out.println("동생 2 : 보");
            }
            System.out.println("동생 1의 승리!!");
        }
        return b2Ans == b1Ans +1 || b1Ans == b2Ans + 2;
    }

    public void gameStart(Brother1 b1, Brother2 b2){
        start();
        int b2Ans = askBro2(b2);
        int b1Ans = 0;
        boolean isEnd = false;
        int count = 0;
        while (true) {
            count++;
            b1Ans = askBro1(b1);
            isEnd = judge(b1Ans, b2Ans);
            if (isEnd) {
                System.out.printf("당신은 %d번만에 패배하였습니다!!", count);
                break;
            }
        }

    }


}
