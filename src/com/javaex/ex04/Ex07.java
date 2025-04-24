package com.javaex.ex04;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int y=1; y<=6; y++) {
			for(int x=1; x<=6; x++) { 
				System.out.print("*");
			}
			System.out.println("");
		}
		
		sc.close();
	
	}
}
