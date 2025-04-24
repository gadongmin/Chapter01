package com.javaex.ex04;

public class Ex12 {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {
				continue; // 홀수 출력
			}
			System.out.println(i);
		}
		System.out.println("==========================");
		
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {
			}else {
			System.out.println(i); // 홀수 출력
			}
		}
		System.out.println("==========================");
		
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {
				System.out.println(i); //짝수 출력
			}
		}
		System.out.println("==========================");
		
		for(int i=1; i<=10; i++) {
			if(i % 2 != 0) {
				System.out.println(i); //홀수 출력, if문 출력
			}
		}
		System.out.println("==========================");
		
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {
			}
			System.out.println(i); //for문 출력
		}
	}

}
