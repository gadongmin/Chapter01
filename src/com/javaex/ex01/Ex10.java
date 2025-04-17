package com.javaex.ex01;

public class Ex10 {
	public static void main(String[] args) {
		//관계연산자
		int a = 5;
		int b = 3;
		System.out.println(a<b); // 5<3, false
		System.out.println(a>b); // 5>3, true
		System.out.println(a<=b); // 5<=3, false
		System.out.println(a>=b); // 5>=3, true
		System.out.println(a==b); // 5=3(같은가?), false
		System.out.println(a!=b); // 5!=3(다른가?), true
		
		//논리형 키워드
		boolean result = a==b; // 5,3이 같은가?
		System.out.println(result); // false
		
	}
}
