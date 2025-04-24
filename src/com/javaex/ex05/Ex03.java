package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		
	int[] lotto	= new int[6];
	
	/*
	// 일정한 규칙으로 for문을 사용할 수 있다.
	// 보통 규칙이 없는 경우가 많아 입력하는 것을 기본값이라 생각하는것이 좋다.
	lotto[0] = (int)(Math.random()*45)+1;
	lotto[1] = (int)(Math.random()*45)+1;
	lotto[2] = (int)(Math.random()*45)+1;
	lotto[3] = (int)(Math.random()*45)+1;
	lotto[4] = (int)(Math.random()*45)+1;
	lotto[5] = (int)(Math.random()*45)+1;

	for(int i=0; i<6; i++) {
		System.out.println(lotto[i]);
	*/
	
	// 일정한 규칙 시 표현방식
	for(int i=0; i<6; i++) {
		lotto[i] = (int)(Math.random()*45)+1;
		System.out.println(lotto[i]);
	}
	
	/*
	System.out.println(lotto[0]);
	System.out.println(lotto[1]);
	System.out.println(lotto[2]);
	System.out.println(lotto[3]);
	System.out.println(lotto[4]);
	System.out.println(lotto[5]);
	*/
	}
	
}


