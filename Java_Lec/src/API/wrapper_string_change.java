package API;

public class wrapper_string_change {

	public static void main(String[] args) {
		
		int i = 10;
		Integer wi = new Integer(i); // Boxing int -> Integer
		Integer wi2 = i; // Auto UnBoxing
		
		String str1 = wi.toString(); // int -> String
		String str2 = Integer.toString(i); // int -> String
		String str3 = String.valueOf(i); // int -> String
		String str4 = i+""; // int -> String
		System.out.println(str1+str2+str3+str4); // 4개다 문자열임

		
		String str = "100"; // 100A처럼 문자가 껴잇으면 안됨
		
		Integer wi1 = new Integer(str); // String -> Integer
		int i1 = wi1.intValue();
		int i2 = wi1; // Auto Unboxing
		int i3 = Integer.parseInt(str); // 가장 많이씀
		
		System.out.println(i1+i2+i3);
		
		
		/*
		 
		1. String -> 기본 자료형
			
			(1)래퍼 클래스 객체 생성 (생성자의 매개변수 값에 문자열 전달) 후 언박싱 또는 오토언박싱
				ex) Integer wi = new Integer("10");
					int i = wi.invalue; / int i = wi;
					
			(2)래퍼 클래스의 정적(static)메소드 (parse 기본자료형(문자열))로 변환
			
			
		2. 기본 자료형 -> String
			
			(1)기본 자료형 박싱(래퍼 클래스 객체 생성) 후 래퍼 클래스의 toString()메소드 이용
			
			(2)래퍼 클래스의 정적 메소드인 toString(기본자료형) 이용
			
			(3)String 클래스의 정적 메소드인 valueOf(기본자료형) 이용
			
			(4)기본자료형 "" 더하기(+) 연산
			
		 */

	}

}
