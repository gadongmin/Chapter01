package com.javaex.ex04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		for(int i=1; i<=100; i++) {
			num = num + i;
			System.out.println(i + "까지의 합은 " + num + " 입니다.");
		}
				
		sc.close();
		

	}

}
