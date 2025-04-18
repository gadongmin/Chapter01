package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int work = sc.nextInt();
		int sum; // if문 밖에서 사용하기 위한 변수 선언
		
		if(work <= 8) {		
			sum = work * 10000;
		
		}else {		
			sum = (work-8)*12000 + 8*10000;
		}

		System.out.println("임금은 " + sum + "원 입니다.");	
		sc.close();
		
	}
}
