package com.javaex.ex05;

public class Ex10 {

	public static void main(String[] args) {

		int[] intArr = new int[3];
		intArr[0] = 3;
		intArr[1] = 6;
		intArr[2] = 9;

		int[] intBrr = new int[3];
		
		for(int i=0; i<intArr.length; i++) {
			intBrr[i] = intArr[i];
			System.out.println(intArr[i]);
		}
		
		System.out.println("-------------------");
		intArr[1] = 100;		
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		System.out.println("-------------------");
		intBrr[2] = 100;
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intBrr[i]);
		}

	}

}
