package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int point = sc.nextInt();

		if(point >= 90) {
			System.out.println("A등급");
		
		}else if(point >= 80) { 
      // else if(point < 90 && point >= 80)	
			System.out.println("B등급");
		
		}else if(point >= 70) { 
      // else if(point < 80 && point >= 70)	
			System.out.println("C등급");
		
		}else if(point >= 60) { 
      // else if(point < 70 && point >= 60)		
			System.out.println("D등급");
		
		}else{ 
      // else if(point < 60)
			System.out.println("F등급");
		}
				
		sc.close();

	}

}
