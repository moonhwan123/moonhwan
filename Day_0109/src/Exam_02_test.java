import java.util.Scanner;

public class Exam_02_test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("번호 입력 : ");
		int a = sc.nextInt(); // 번호 //버퍼에서 끄집어 낸다
		sc.nextLine();
		System.out.print("국어 입력 : ");
		int b = sc.nextInt();
		
		System.out.println("번호"+a);
		System.out.println("국어"+b);

	}

}
