/*
[String클래스 메소드]
valueOf(); 
String.format(); -> 형식 지정

 */

public class Exam_01 {
	
	public static void main(String[] args) {
		
		int a = 100;
		
		String aa = a+""; // a는 문자열로 바뀜 
		String ab = String.valueOf(a); // 스태틱 메소드라서 클래스 이름으로 직접 접근
		String ac = String.valueOf(true); //"true"
		
		//래퍼클래스 (Wrapper Class)
		//기본자료형인데 그게 클래스일때
		//int -> Integer / byte -> Byte / char -> Character
		
		int b = Integer.parseInt(ab); // 문자열을 정수로
//  	int bb = Integer.parseInt("123a"); // 런타임 에러 발생
		int bbb = Integer.valueOf(ab); // 정수로 바꿔라 
		
		int var = 100;
		double dou = 3.141582;
		
		//정수 var=100  실수 dou= 3.14
		
		System.out.println("정수 var = "+var+" 실수 dou = "+dou);
		
		String ss = String.format("정수 var = %5d 실수 dou = %f ", var,dou);
		System.out.println(ss);
		
		String sss = String.format("정수 var = %10d 실수 dou = %10.3f ", var,dou);
		System.out.println(sss);
		
		
		
	}

}
