package com.javaex.ex02;

public class Ex01 {
	public static void main(String[]args) {
		
		System.out.println("안녕"); // println는 개행(줄바꿈) 적용
		System.out.println("하세요");
	
		System.out.print("안녕"); // print 이어서 출력
		System.out.print("하세요");
		
		System.out.println(""); // 개행(줄바꿈) 효과
		System.out.println("-------------------------------");
		
		int i = 2345;
		double d = 3.14;
		char c = '한';
		
		String s = "안녕하세요";
		String str = "Good moning";
		String name = "김동민";
		
		System.out.println(i);
		System.out.println(str);
		System.out.println(5+3);
		
		System.out.println("Good moning" + "김동민"); // 단어 + 단어 출력됨, 다른 연산자(-,*,/)는 안됨
		System.out.println(str + name + d); // 변수 + 변수 출력됨, 다른 연산자(-,*,/)는 안됨
		System.out.println("Good moning" + d); // 단어 + 변수 출력됨, 다른 연산자(-,*,/)는 안됨
		
		System.out.println(i + i); // 정수 + 정수
		System.out.println(i + d); // 정수(실수, 자동형변환) + 실수 = 실수
		System.out.println(str + i);
		System.out.println(str + d);
		
		String result = name + d; // 문자열 + 정수(문자열 자동 형변환) = 문자열
		System.out.println(result);
		
		System.out.println(str + "랑" + name); // 문자열 사이 문자 추가
		System.out.println(str + " 랑 " + name);
		System.out.println(str + " " + "랑" + " " + name);
		System.out.println(str + " " + name);
		System.out.println("제 이릅은 " + name + " 입니다." );
		System.out.println("-------------------------------");

		System.out.println(c);
		System.out.println(c+c); // c코드 값을 더한 값을 출력

		System.out.println("제 이릅은 \"" + name + "\" 입니다." ); // 큰따움표
		System.out.println("제 이릅은 \\" + name + "\\ 입니다." ); // 역슬래쉬
		System.out.println("제 이릅은\t" + name + " 입니다." ); // Tab
		System.out.println("제 이릅은\n" + name + " 입니다." ); // 개행(줄바꿈)
		
	}
}

