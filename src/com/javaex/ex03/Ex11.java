package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요.");
		System.out.println("(1. java 2. C  3. C++ 4. python)");
		System.out.print("과목번호: ");
		String code = sc.nextLine();

		switch (code) { //if()문
			case "A": // if(code == A)
				System.out.println("R101호");	
				break;
				
			case "B": // else if(code == B)
				System.out.println("R202호");	
				break;
				
			case "C": // else if(code == C)
				System.out.println("R303호");	
				break;
				
			case "D": // else if(code == D)
				System.out.println("R404호");	
				break;
			
			default: // else
				System.out.println("상담원에게 문의하세요.");	
				break;
		}	

		sc.close();
		
	}
}