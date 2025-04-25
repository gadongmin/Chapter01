package com.javaex.ex05;

public class Ex04 {
	public static void main(String[] args) {
		
		int[] intArr = new int[] {3,6,9}; // 아래와 같은표현방식
		
		/*
		intArr[0] = 3;
		intArr[1] = 6;
		intArr[2] = 9;
		*/
		
		/*
		for(int i=0; i<3; i++) {
			System.out.println(intArr[i]);
		*/
		
		for(int i=0; i<intArr.length; i++) { // 반복조건 아파츠 안 방갯수만큼 반복
			System.out.println(intArr[i]);
		}
		
		System.out.println("----------------");
		System.out.println(intArr.length); // 아파트 안에 방이 몇개있는지 확인하는 방법
	}
}
