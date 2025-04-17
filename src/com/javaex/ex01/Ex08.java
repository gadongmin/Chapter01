package com.javaex.ex01;

public class Ex08 {
	public static void main(String[] args) {
		
		//대입연산자  = 오른쪽의 값을 왼쪽 변수로 대입
		int a = 7;
		int b = 2;
		System.out.println(a);
		System.out.println(b);
		System.out.println("---------------------------------------------------");
		
		//산술연산자 정수는 모든 연산자 값에서 정수로 출력된다.
		int sum = a+b;
		System.out.println(sum); // +
		
		System.out.println(a+b); // +
		System.out.println(a-b); // -
		System.out.println(a*b); // *
		System.out.println(a/b); // 7/2 = (3)---1
		System.out.println(a%b); // 7/2 = 3---(1)
		
		System.out.println(7/2); // 정수 연산자 정수 => 정수
		System.out.println(7.0/2); // 실수 연산자 정수(실수로 자동변환되어 계산됨) => 실수
		System.out.println("---------------------------------------------------");
		
		//부호연산자
		int var = -3;
		int pVar = -var; //-(-3) ==> +3
		System.out.println(pVar);
		
		int mVar = +var; //+(-3) ==> -3 
		System.out.println(mVar);
		System.out.println("---------------------------------------------------");
		
		//증감연산자(변수값 변경, 증감을 가장 우선적으로 처리)
		System.out.println(a); // 7
		System.out.println(+a); // 7 
		System.out.println(++a); // 7 → 8, 실제 메모리 값(7)을 (8)변경함, 이후 변수값이 8로 변경되어 계산됨
		System.out.println(a); // 7
		
		System.out.println(b); // 2
		System.out.println(--b); // 2 → 1
		System.out.println(b); // 2 → 1, 실제 메모리 값(2)을 (1)변경함, 이후 변수값이 1로 변경되어 계산됨
		System.out.println("---------------------------------------------------");

		//증감연산자(변수값 증감 처리된 상태지만 기존값을 먼저 출력)
		System.out.println(a); // 8
		System.out.println(a++); // 8, 출력을 먼저하고 +1작업 수행
		System.out.println(a); // 9, 증감되어 출력 
		
		System.out.println(b); // 1
		System.out.println(b--); // 1, 출력은 기존값으로 되어 있으나, -1 완료된 상태
		System.out.println(b); // 0
		
		/*
		 증감연산자는 해야하는일에 따라 부호가 앞이나 뒤로 설정하게 된다.
		*/
		System.out.println("---------------------------------------------------");
		
		int c = 5;
		System.out.println(c);
		System.out.println(++c * 2); // (5+1) * 2 = 12, 증감연산이 적용되어 계산됨
		System.out.println(c); // 6, 변수값 변경(++c = 5+1)
	
		int d = 5;
		System.out.println(d); // 5
		System.out.println(d++ * 2); // 5 * 2 = 10, 증감연산은 차후 적용되어 기존 변수값에 적용되어 계산
		System.out.println(d); // 6, 재출력 시 증감연산이 적용되어 변수값 변경되어 출력 
	}	
}
