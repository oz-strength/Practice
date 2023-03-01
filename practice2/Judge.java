package com.oz.march1.practice2;

public class Judge {
	// 나 부르기 
	public Me callMe() {
		System.out.println("심판 : 나와!");
		System.out.println("나 : 등장!!");
		return new Me(); // Me라는 타입으로 생성자를 반환!!
	}
	
	// 친구에게 답 요구
	public int askFriAns(Friend f) {
		int friAns = f.writeFriAns();
		return friAns;
	}
	
	// 나에게 답 요구
	public int askMyAns(Me mm) {
		int myAns = mm.tellMyAns();
		if(myAns < 1 || myAns > 100) {
			System.out.println("다시 제출!");
			}
		return (myAns >= 1 && myAns <= 100) ? myAns : askMyAns(mm);
	}
	
	// 판정 (맞출때까지)
	public boolean judge(int answer, int myAnswer)	{
		if (answer == myAnswer) {
			System.out.println("...! 정답");
		} else if (answer > myAnswer) {
			System.out.println("UP!");
		} else {
			System.out.println("DOWN!");
		}
		return (answer == myAnswer);  // 정답일때 true 값을 boolean 타입으로 리턴
	}
	
	// 시도 횟수
	public void countTry(int turn) {
		System.out.println("==========");
		System.out.printf("%d 번째 시도만에 정답! \n", turn);
		System.out.println("==========");
	}
	
	public void start(Friend f) {
		Me mm = callMe(); // 메소드 호출로 생성자 반환
		int answer = askFriAns(f);
		int myAnswer = 0;
		boolean endGame = false; // 불리안 타입의 변수를 하나 만들어서
		// 기본값을 false로 둔 다음,
		int turn = 0;
		while(true) {
			turn++;
			myAnswer = askMyAns(mm);
			endGame = judge(answer, myAnswer); // judge메소드로 두 값을 비교해서 불리안 타입을 반환
			if (endGame) {
				countTry(turn);
				break;
			}
		}
	}
	
	
	
	
	
	
	
}