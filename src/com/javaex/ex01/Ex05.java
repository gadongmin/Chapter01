/*
실수형 키워드 적용
키워드 앞 final 키워드 사용하면 상수로 정의하는 고정값으로 됨
상수로 고정된 값은 변경시도 시 오류발생
*/

package com.javaex.ex01;

public class Ex05 {
	public static void main(String[]args) {
		
		//일반적인 방식
		double pi= 3.14; 
		
		double result01 = pi*5*5;
		System.out.println(result01);

		//초기화 값 변경 가능
		pi = 3.141512; //키워드(double)를 뺴면 기존값 수정
		double result02 = pi*5*5;
		System.out.println(result02);
		
		//************************************************************//
		
		//상수로 정의하는 방식(초기화 값 고정)
		final double PI = 3.14; // 상수로 선언(final 고정값)할 떄 변수를 대문자로 작성
		
		double result03 = PI*5*5;
		System.out.println(result03);

		/*
		PI = 3.1415926; //상수로 선언(고정값)한 값은 변경을 실행하면 오류발생
		double result04 = PI*5*5;
		System.out.println(result04);
		*/

	}
}
