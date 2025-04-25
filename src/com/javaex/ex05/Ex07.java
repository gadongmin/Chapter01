package com.javaex.ex05;

public class Ex07 {
	public static void main(String[] args) {
		int[] intArr;
		intArr = new int[5];
		intArr[0] = 3;
		intArr[1] = 6;
		intArr[2] = 9;
		
		int result = 0;
		
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]); // 값이 없는 방의 값은 0으로 출력
			result = result +intArr[i];
		}
		
		System.out.println("intArr의 4번째 값: " + intArr[3]);
		
	}
}
