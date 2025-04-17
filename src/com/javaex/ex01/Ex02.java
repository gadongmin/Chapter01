/*
실수형 키워드 적용
float 4byte(32bit) 숫자 뒤에 'F' 작성
double 8byte(64bit)
*/

package com.javaex.ex01;

public class Ex02 {

	public static void main(String[] args) {
		
		/* 2호흡,
		 double var01;
		 var01 = 3.14;
		*/
		double var01 = 3.14;
		
		// 1호흡, float var02 = 3.14;
		float var02;
		var02 = 3.14F; // float는 숫자 뒤에 'F'를 붙인다.		

		System.out.println(var01);
		System.out.println(var02);
		
		//*******************************************
		
		double var03 = 0.1234567890123456789;
		float var04 = 0.1234567890123456789F;

		System.out.println(var03);
		System.out.println(var04);
		
	}		
}


