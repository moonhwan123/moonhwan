import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Ctrl + shift + o
		//sc - ����(������)
		//new - ������ (��ü����)
		//int num = 10;
		//System.out.println("num = " + num);
		//System.out.println("sc = " + sc);
		
		
		int a = sc.nextInt();
		System.out.println("a = "+a);
		
		double b = sc.nextDouble();
		System.out.println("b = "+b);
		
		String c = sc.next(); // ��׵��� �����̽����� �ν�
		System.out.println("c = "+c);
		// �׷��� ���� �Է� �ҋ� �� �����̽� ���ָ��
		
		//String d = sc.nextLine(); // ��� ������ �� ���ŷ� �ν�
		
		
		
		
		sc.close();
	}
}
