package com.javaex.ex05;

public class Ex12 {

	public static void main(String[] args) {
				
		for(int i=0; i<args.length; i++) {
			if(args[i].equals("-v")) {
				System.out.println("버전3.0");
			}
			
			if(args[i].equals("-d")) {
				System.out.println("20250428");
			}
			
			if(args[i].equals("-n")) {
				System.out.println("미스터김");
			}
		}
	}
}
