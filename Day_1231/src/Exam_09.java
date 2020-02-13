import java.util.Scanner;

/*
키보드입력 
50~90 사이의 자료 10개 입력 후 합계 출력

EX) 10,80,60,90,95 ........
 */


public class Exam_09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int cnt = 0;
		
		System.out.println("정수를 입력하세요(50~90까지의 숫자중 10개까지 합산 됩니다.) >>");
		while(cnt < 10) { // if(break)문 안쓰고 
			int num = sc.nextInt();
			if(num >= 50 && num <= 90) {
				cnt ++;
				sum += num;
			}
		}
		System.out.println("sum = "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
