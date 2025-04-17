/*
문자형 키워드 적용 
따움표가 있으면 문자로 적용, 없으면 코드로 인식하여 코드표에 있는 값으로 적용
쌍따움표는 오류 문자은 String 키워드 적용
*/

package com.javaex.ex01;

public class Ex04 {
	public static void main(String[] args) {
		
		char ch01 = 'A';
		char ch02 = '안';
		System.out.println(ch01);
		System.out.println(ch02);

		
		char ch03 = 65; //따움표가 없으면 코드표로 인식, 코드안에 있는 문자로 출력
		System.out.println(ch03);
		
		char ch04 = '3'; //따움표 안에 있는 숫자는 글자로 적용, 숫자 그대로 출력
		System.out.println(ch04);
		
		/*
		char ch05 = "안"; 쌍따움표는 인식오류
		System.out.println(ch05);
		*/
		
	}
}
