/* 
정수형 키워드 적용
byte 1byte(8bit)
short 2byte(16bit)
int 4byte(32bit)
iong 8byte(64bit)
*/

package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {

		int myAge; //선언(메모리 공간확보)
		// myAge은 설정 된 이름으로 변수라 표현	
			
		myAge = 25; //초기화(값을 첨음 넣는것, 공간이름 설정)
		System.out.println(myAge); //초기화 값 화면에 출력

		myAge = 26; //초기화 값 추가
		System.out.println(myAge); // 추가된 초기화 값 화면에 출력
		
		//*************************************************//
		byte no; //byte는 -128 ~ 127까지만 가능, 키워드에 따라 입력할수 있는 숫자에 크기가 달라짐
		no = 127;
		System.out.println(no);
		
		long no2; //long은 int를 넘어선 숫자에는 숫자뒤에 'L'문자를 붙여야 적용된다.
		no2 = 2147483648L; // int 최대값 214748364을 넘어선 숫자 뒤에는 'L'
		System.out.println(no2);
		
	}
	
}
