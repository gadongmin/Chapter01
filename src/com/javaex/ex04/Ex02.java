package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요.");
		System.out.print("단 : ");
	
		
		int num = sc.nextInt();
		int i = 1; // 초기화
		while(i <= 9) { // 반복조건
			System.out.println(num + " * " + i + " = " + num*i); 
			i++; // 증감식
		}
		
		/*
		int num = sc.nextInt();
		int i = 0; // 초기화
		while(i < 9) { // 반복조건
			System.out.println(num + " * " + (i+1) + " = " + num*(i+1)); 
			i++; // 증감식
		}
		*/
		
		/*		
		int num = sc.nextInt();
		int i = 0; // 초기화
		int index = 1; // 설정값
		
		while(i < 9) { // 반복조건
			System.out.println(num + " * " + index + " = " + num*index); 
			i++; // 증감식
			index++; //증감식 
		}
		*/
		sc.close();

	}

}
