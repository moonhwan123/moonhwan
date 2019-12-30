import java.util.Scanner;

/*
1.세개의 정수중 대,중,소 
다 찾을때
1219 10번도 대중소 찾기임
 */



public class Exam_11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1을 입력 하세요 >> ");
		int a = sc.nextInt();
		System.out.print("정수2을 입력 하세요 >> ");
		int b = sc.nextInt();
		System.out.print("정수3을 입력 하세요 >> ");
		int c = sc.nextInt();
		
		int max, mid, min;
		
		if(a>b) { // a>b
			if(a>c) {
				max = a;
				if(b>c) {
					mid = b;
					min = c;
				}else { // b<c
					mid = c;
					min = b;
				}
			}else { // a<c
				max = c;
				mid = a;
				min = b;
			}
		}else { // a<b
			if(b>c) {
				max = b;
				if(a>c) {
					mid = a;
					min = c;
				}else { // a<c
					mid = c;
					min = a;
				}
			}else { // b<c
				max = c;
				mid = b;
				min = a;
			}
		}
		
		
		System.out.println("max = "+max);
		System.out.println("mid = "+mid);
		System.out.println("min = "+min);
		
		
		
		sc.close();
		
		
		

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
