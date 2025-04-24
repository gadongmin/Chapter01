package com.javaex.ex04;

public class Ex11 {

	public static void main(String[] args) {
		/*
		for(int i = 1; i<=10; i++) {
			if(i % 2 == 0 && i % 3 == 0) {
				break;  // 반복에서 바로 탈출
			}
			System.out.println(i);
		}
		*/
		for(int i =1; i<=10; i++) {
			if(i % 2 == 0 && i % 3 == 0) {
				continue; // 반복에서 이번 반복만 제외하고 계속 진행
			}
			System.out.println(i);
		}
	}

}
