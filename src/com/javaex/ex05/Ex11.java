package com.javaex.ex05;

public class Ex11 {

	public static void main(String[] args) {
		int[] leftArr = new int[] {10,20,30};
		int[] rightArr = new int[] {10,20,30};
		
		if(leftArr.length == rightArr.length) { // 배열의 크기가 같을때
			for(int i=0; i<leftArr.length; i++) {
				if(leftArr[i] != rightArr[i]) { // 긍정일때 출력값이 없으면, 부정으로 출력시 내용을 줄일수 있다.
					System.out.println(i + "번쨰 값이 다릅니다.");	
				}
			}
			
		}else {
			System.out.println("두배열의 크키가 다릅니다.");
		}
		
		}

	}

