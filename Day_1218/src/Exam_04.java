import java.util.Scanner;

/*
��ȣ, �̸�, ����, ����, ���������� Ű����� �Է�
����, ���(�Ҽ����� ����° �ڸ����� �ݿø�)
�� ������ ���� �Ǵ� �Ǽ� ��� ����
 */
public class Exam_04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ȣ�� �Է��ϼ��� : ");
		int number = sc.nextInt();
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.next();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		double kor = sc.nextDouble();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		double eng = sc.nextDouble();
		
		System.out.print("���� ������ �Է� �ϼ��� : ");
		double math = sc.nextDouble();
		
		double total = kor + eng + math;
		
		double ave = (double)total/3; 
		ave = (int)(ave*100+0.05)/100.; 
		
		System.out.println("========================");
		System.out.println("��ȣ�� : "+number);
		System.out.println("�̸��� : "+name);
		System.out.println("������ : "+total);
		System.out.println("����� : "+ave);
		
		sc.close();
		
		
		
	}

}
