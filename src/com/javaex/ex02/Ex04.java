package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		//키보드 연결
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요.");
		System.out.print("이름: ");
		String name = sc.nextLine(); // 키워드 변수 = 콘솔입력(문자열)
		
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이: ");
		int age = sc.nextInt(); // 키워드 변수 = 콘솔입력(숫자)
		
		System.out.println("당신의 이름은 " + name + " 나이는 " + age + " 입니다.");
	
		//키보드 해제		
		sc.close();

	}
}
