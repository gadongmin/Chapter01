package com.javaex.ex04;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int num=2; num<=9; num++ ) {
			for(int i=1; i<=9; i++ )
				System.out.println(num + " * " + i + " = " + num*i);
		}
		
		sc.close();
	}
}
