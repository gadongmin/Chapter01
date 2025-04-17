/* 논리연산자
 * and연산자, 둘 중에 한쪽이라도 false가 오면 false로 판단
 * or연산자,  둘 중에 한쪽이라도 true가 오면 true로 판단
 * not연산자, 반대로 만드는 연산자 !true = false 
 */



package com.javaex.ex01;

public class Ex11 {
	public static void main(String[] args) {
		//논리연산자
		int a = 5;
		int b = 7;
		
		System.out.println("&& and연산자(엄격함)--------------------");
		System.out.println(true && true); // true
		System.out.println(false && false); // false
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		
		System.out.println("|| or연산자(인자함)--------------------");
		System.out.println(true || true); // true
		System.out.println(false || false); // false
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		
		System.out.println("! not연산자(반대)--------------------");
		System.out.println(!true); // false
		System.out.println(!false); // true
		
		System.out.println("응용--------------------");
		boolean result = (a<b)&&(a>b); // (5<7)&&(5>7) = false&&true → false
		System.out.println(result);
	
		System.out.println(true && false || true); // 순서대로 계산 true && false → false || true  → true
		System.out.println(true || false || true); // 순서대로 계산 true && false → true || true → true
		System.out.println(!(a>b)); // 5>7 = !(false) → true
		
	}
}