import java.util.Scanner;

/*
[문자열 처리 및 자료형 입력]
	1. 문자열처리
		-String class를 이용
		
	2. 자료형 입력
		-Scanner class를 이용
 */
public class Exam_07 {
	
	public static void main(String[] args) {
		
		//[문자열 처리 String class]
		String str = "AAAA"; 
		// String은 기본 자료형이 아님!(중요) , str변수에는 '주소값'이 저장 되어있다. -> 그래서 참조형
		System.out.println(str);
		System.out.println();
		
		
		//[Scanner class]
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력 하세요 : ");
		String name = sc.next(); // nextInt() - 정수 , nextDouble() - 실수
		System.out.println("이름은 "+name+" 입니다.");
		
		sc.close();
		
		
		
		
		
	}

}
