import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Ctrl + shift + o
		//sc - 변수(참조형)
		//new - 연산자 (객체생성)
		//int num = 10;
		//System.out.println("num = " + num);
		//System.out.println("sc = " + sc);
		
		
		int a = sc.nextInt();
		System.out.println("a = "+a);
		
		double b = sc.nextDouble();
		System.out.println("b = "+b);
		
		String c = sc.next(); // 얘네들은 스페이스까지 인식
		System.out.println("c = "+c);
		// 그래서 연속 입력 할떄 걍 스페이스 쳐주면됨
		
		//String d = sc.nextLine(); // 얘는 한줄을 걍 통쩨로 인식
		
		
		
		
		sc.close();
	}
}
