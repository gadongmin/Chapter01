package com.javaex.ex02;

import java.util.Scanner;

public class Ex00 {
	public static void main(String[] args) {
	// 키보드 연결
	Scanner	sc = new Scanner(System.in);
	
	System.out.println("이름을 입력해주세요.");
	System.out.print("이름: ");
	String name2 = sc.nextLine();
	
	System.out.println("나이를 입력해주세요.");
	System.out.print("나이: ");
	int age2 = sc.nextInt(); 
	
	System.out.println("키를 입력해주세요.");
	System.out.print("키: ");	
	float height = sc.nextFloat();
	
	System.out.println("당신의 이름은 " + name2 + " 나이는 " + age2 + " 키는 " + height + " 입니다.");
		
	// 키보드 해제	
	sc.close();
	}
}
