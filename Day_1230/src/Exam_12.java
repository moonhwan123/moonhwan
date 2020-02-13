import java.util.Scanner;

/*
1.세개의 정수중 대,중,소 
다 찾을때
1219 10번도 대중소 찾기임
 */



public class Exam_12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1을 입력 하세요 >> ");
		int a = sc.nextInt();
		System.out.print("정수2을 입력 하세요 >> ");
		int b = sc.nextInt();
		System.out.print("정수3을 입력 하세요 >> ");
		int c = sc.nextInt();
		
		// switch 알고리즘 이용
		
		if(a<b) { 
			// a, b 값 바꾸기 큰값이 a에 저장
			int s = a;
			a = b;
			b = s;
		}
		if(a<c) {
			int s = a;
			a = c;
			c = s;
		}
		if(b<c) {
			int s = b;
			b = c;
			c = s;
		}
		
		System.out.println("max = "+a);
		System.out.println("mid = "+b);
		System.out.println("min = "+c);
		
		sc.close();
		
		
		

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
