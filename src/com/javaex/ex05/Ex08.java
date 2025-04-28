package com.javaex.ex05;

public class Ex08 {

	public static void main(String[] args) {
		
		// 배열A
		int[] intArr = new int[3];
		intArr[0] = 3;
		intArr[1] = 6;
		intArr[2] = 9;
		
		// 배열B
		int[] intBrr = new int[3];
		intBrr[0] = 3;
		intBrr[1] = 6;
		intBrr[2] = 9;

		for(int i = 0; i<intArr.length; i++){
			System.out.println(intArr[i]);
		}
		
		System.out.println("========================");
		
		for(int i = 0; i<intBrr.length; i++){
			System.out.println(intBrr[i]);
		}
		
		System.out.println("========================");

		//배열A[1] 100으로 변경
		intArr[1] = 100;
		
		for(int i = 0; i<intArr.length; i++){
			System.out.println(intArr[i]);
		}
		
		System.out.println("========================");
		
		for(int i = 0; i<intBrr.length; i++){
			System.out.println(intBrr[i]);
		}

	}

}
