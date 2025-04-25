package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		
		int[] intArr = new int[3];
		intArr[0] = 3;
		intArr[1] = 6;
		intArr[2] = 9;
		
		// int[] intArr = new int[] {3,6,9}; , 아파트 안에 숫자제거
		
		// int[] intArr =  {3,6,9};, 간단하지만 추천하지 않음
		
		for(int i = 0; i<intArr.length; i++) {
			System.out.println(intArr[i]); // 변수작성 강조
		}
		
	}

}
