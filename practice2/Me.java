package com.oz.march1.practice2;

import java.util.Scanner;

public class Me {
	// 정답을 입으로 말하기
	Scanner mouth = new Scanner(System.in);
	
	public int tellMyAns() {
		System.out.println("정답은 : ");
		int myAns = mouth.nextInt();
		return myAns;
		
	}
	
	
}
