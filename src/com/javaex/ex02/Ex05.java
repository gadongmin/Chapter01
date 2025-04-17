package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		//키보드 연결
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이: ");
		int age = sc.nextInt(); // 키워드 변수 = 콘솔입력(숫자)
		
		sc.nextLine(); // 숫자를 입력 후 문자열을 입력받으면 생기는 오류를 해결해주는 방법
		
		System.out.println("이름을 입력해주세요.");
		System.out.print("이름: ");
		String name = sc.nextLine(); // 키워드 변수 = 콘솔입력(문자열)
				
		System.out.println("당신의 나이는 " + age + " 이름은 " + name + " 입니다.");
	
		//키보드 해제		
		sc.close();

	}
}
