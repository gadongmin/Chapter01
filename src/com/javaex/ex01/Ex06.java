/*
정수 + 실수 합일떄 크기의 구조
byte(1byte) < short(2byte) < int(4byte) < long(4byte) < float(2byte) < diuble(4byte) 
boolean(1byte) 논리형 키워드는 적용되지 않음
char(2byte) 문자형 키워드는 결과는 나오나 오류값으로 적용

자동/강제 형변형 키워드별 크기에 따라 작은형태가 큰형태에게 잡아먹히는 구조임
실수와 정수일때는 실수로 적용

같은 정수일때 작은숫자는 작은키워드로 변형가능하나 큰숫자는 오류로 출력됨
ex) 숫자가 byte 이내 숫자인 경우 int → byte 으로 변형해도 출력값 정상
    하지만 숫자가 byte 초과인 경우에는 출력값 오류  

*/

package com.javaex.ex01;

public class Ex06 {
	public static void main(String[] args) {

		// 자돟 형변환 + 다른 자료형(정수+실수)
		double var01 = 2+3.5; // 정수인 2를 실수 2.0으로 자동으로 형변환됨
		System.out.println(var01);
		
		float var02 = 3.0F+6; // '0.0' 소수점이면 무조건 실수로 표시함, 6이
		System.out.println(var02);
		
		//
		long var03 = 12345L;
		float var04 = 1.5F;
		
		float result01 = var03+var04;
		System.out.println(result01);
		
		/* 사용하지 않는 형변환(정수+코드)
		int var05 = 65;
		char var06 = '5';
		int result02 = var05+var06;
		System.out.println(result02);
		*/

		// 강제 형변환 실수 → 정수
		float var05 = 111.6456F;
		int var06 = (int)var05; // 111.6456F → 111 강제변환
		System.out.println(var06);
		
		double var10 = 5.57;
		System.out.println(var10);
		byte result05 = (byte) var10;
		System.out.println(result05); // 5로 출력, 소수점 없어짐

		// 강제 형변환 정수 → 실수
		int var11 = 7; 
		System.out.println(var11);
		double result06 = (double)var11;
		System.out.println(result06); // 7.0으로 출력, 소수점 생김
		
		
		// 강제 형변환(확대) byte → int
		byte var07 = 10;
		System.out.println(var07);
		int result02 = (int)var07;
		System.out.println(result02);
	
		// 강제 형변환(축소) int → byte, 초기화값이 작아 정상적으로 변형
		int var08 = 10;
		System.out.println(var08);
		byte result03 = (byte)var08;
		System.out.println(result03);
		
		// 강제 형변환(축소) int → byte, 초기화값이 높아 비정상적으로 변형
		int var09 = 203029770;
		System.out.println(var09);

		byte result04 = (byte)var09; 
		System.out.println(result04); //결과값 10으로 출력
				
	}
}
