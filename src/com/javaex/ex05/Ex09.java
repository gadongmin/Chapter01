package com.javaex.ex05;

public class Ex09 {
	public static void main(String[] args) {

		int[] intArr = new int[3];
		intArr[0] = 3;
		intArr[1] = 6;
		intArr[2] = 9;
		
		int[] intBrr = intArr;

		//A출력
		for(int i = 0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		System.out.println("---------------------");
		
		//B출력
		for(int i = 0; i<intBrr.length; i++) {
			System.out.println(intBrr[i]);
		}
		
		System.out.println("---------------------");

		intArr[1] = 100;
		
		//A출력
		for(int i = 0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		System.out.println("---------------------");
		
		//B출력
		for(int i = 0; i<intBrr.length; i++) {
			System.out.println(intBrr[i]);
		}
		
		System.out.println("---------------------");
		intBrr[2] = 999;

		//A출력
		for(int i = 0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		System.out.println("---------------------");
		
		//B출력
		for(int i = 0; i<intBrr.length; i++) {
			System.out.println(intBrr[i]);
		}
		
	}
}
