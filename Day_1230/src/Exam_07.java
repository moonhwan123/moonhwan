import java.util.Scanner;

/*
정수 1개 입력
'A' ~ 'F' 판단

 */


public class Exam_07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력 하세요 >> ");
		int a = sc.nextInt();
		
		if (a>=90) System.out.println("A");
		else if (a>=80) System.out.println("B");
		else if (a>=70) System.out.println("C");
		else if (a>=60) System.out.println("D");
		else  System.out.println("F");
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
	}

}
