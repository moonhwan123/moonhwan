import java.util.Scanner;

/*
세개의 정수중 중간 값만 찾기
max , min 이런 변수 사용x
 */



public class Exam_13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1을 입력 하세요 >> ");
		int a = sc.nextInt();
		System.out.print("정수2을 입력 하세요 >> ");
		int b = sc.nextInt();
		System.out.print("정수3을 입력 하세요 >> ");
		int c = sc.nextInt();
		
		int mid = 0;
		
		if(a>b) {
			if(b>c) {
				mid = b;
			}else { // b<c
				if(a>c) {
					mid = c;
				}else { // a<c
					mid = a;
				}
					
			}
		}else { // a<b
			if(a>c) {
				mid = a;
			}else { // a<c
				if(b<c) {
					mid = b;
				}else { // b>c
					mid = c;
				}
			}
				
		}
		
		System.out.println("정수1 입력 값 :"+ a);
		System.out.println("정수2 입력 값 :"+ b);
		System.out.println("정수3 입력 값 :"+ c);
		System.out.println("그 중 중간 값 : " + mid);

		sc.close();

		

		
	}

}
