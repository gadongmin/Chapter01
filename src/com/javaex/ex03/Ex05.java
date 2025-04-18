package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		double work = sc.nextDouble();
		double sum;
				
		if(work <= 8) {		
			sum = work * 10000;
		
		}else {		
			sum = (work-8)*(10000*1.5) + 8*10000;
		}
		
		System.out.println("임금은 " + (int)sum + "원 입니다.");
		
		sc.close();
		
	}
}
