package com.javaex.ex04;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요.");
			int num = sc.nextInt();

			if(num == 0) {
				break;
			} // break가 있어서 else 생략.
			
			if(num % 3 == 0) {
				System.out.println("3의 배수입니다.");

			}else {
				System.out.println("3의 배수가 아닙니다.");
			} // 반복문 처음으로 이동
			
		}
		
		System.out.println("종료");
		sc.close();
	}
}
