/*
 정수와 실수를 합하는 문제에서는 값을 최대한 안버리는 키워드를 선택하여 값이 출력됨.
 int(long)+float(double) 계산 시 실수형 키워드로 자동변환되어 값이 출력됨.
*/

package com.javaex.ex01;

public class Ex07 {
	public static void main(String[] args) {
		
		double v01 = 5/4;
		System.out.println(v01); //5/4 = 1.25 정수 1로 출력 
		
		double v02 = (double)5/4;
		System.out.println(v02); 
		//키워드(double)를 사용하여 5.0 / 4 = 1.25 출력
		
		double v03 = 5/(double)4;
		System.out.println(v03); //출력값 1.25 실수로 출력
		//키워드(double)를 사용하여 5 / 4.0 = 1.25 출력
		
		double v04 = (double)5/(double)4;
		System.out.println(v04);
		//키워드(double)를 사용하여 5.0 / 4.0 = 1.25 출력
		
		int v05 = (int)1.3 + (int)1.8;
		System.out.println(v05);
		//강제변환 1.3 → (1) + 1.8 → (1) = 2로 출력
		
		double v06 = (int)1.3 + 1.8;
		System.out.println(v06);

	}
}
