package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요.");
		System.out.println("(1. java 2. C  3. C++ 4. python)");
		System.out.print("과목번호: ");
		int code = sc.nextInt();

		switch (code) { //if()문
			case 1: // if(code == 1)
				System.out.println("R101호");	
				break;
				
			case 2: // else if(code == 2)
				System.out.println("R202호");	
				break;
				
			case 3: // else if(code == 3)
				System.out.println("R303호");	
				break;
				
			case 4: // else if(code == 4)
				System.out.println("R404호");	
				break;
			
			default: // else
				System.out.println("상담원에게 문의하세요.");	
				break;
		}	

		sc.close();
		
	}
}