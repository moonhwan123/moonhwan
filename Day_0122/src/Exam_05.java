
/*
[문자열 분리]
substring(시작, 전까지)
substring(시작) 부터 끝까지

현장에서 많이 쓴다고 함

p.469~471 자주쓰는 메소드

 */


public class Exam_05 {
	public static void main(String[] args) {
		
		String str = "Hello World Java";
		
		//전체 문자열 길이 계산
		int length = str.length(); 
		
		//Hello문자만 추출
		String a = str.substring(0,5);
		//Java문자만 추출
		String b = str.substring(12);
		
		System.out.println(length);
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		for(int x = 0; x < str.length(); x++) {
			char ch = str.charAt(x);
			System.out.print(ch + " ");
		}
		
		
	}
}
