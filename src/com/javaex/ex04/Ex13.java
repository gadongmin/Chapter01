package com.javaex.ex04;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		
		int sum = 0; // 합계 초기화 값
		int num; // 변수 설정
		
		do {// 반복구간
			// 숫자입력
			num = sc.nextInt();
			// 합계
			sum = sum + num;
			// 합계
			System.out.println("합계: " + sum);
			if(num == 0) { // 변수가 0입력시 탈출 
				break;				
			}
		}
		while(num != 0); // 0이 아닐시 계속 반복
		
		System.out.println("종료");
		sc.close();
		*/
		
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		System.out.println("숫자를 입력하세요.");
		
		while(true) {
			int num = sc.nextInt(); // 숫자입력
			sum = sum + num; // 누적합계
			System.out.println("합계: " + sum); // 출력
			
			if(num == 0) { // 숫자 0 입력시 반복에서 탈출
				break;
			}
		}
		
		System.out.println("종료"); // 반복문 종료시 출력		
		sc.close();

	}

}
