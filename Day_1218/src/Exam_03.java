import java.util.Scanner;

/*
��ȣ, �̸�, ����, ����, ���������� Ű����� �Է�
����, ���(�Ҽ����� �ι�° �ڸ����� �ݿø�)
 */


public class Exam_03 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ȣ�� �Է��ϼ��� : ");
		int number = sc.nextInt();
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.next();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int kor = sc.nextInt();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int eng = sc.nextInt();
		
		System.out.print("���� ������ �Է� �ϼ��� : ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		
		double ave = (double)total/3; 
		ave = (int)(ave*10+0.5)/10.; 
		
		System.out.println("��ȣ�� : "+number);
		System.out.println("�̸��� : "+name);
		System.out.println("������ : "+total);
		System.out.println("����� : "+ave);
		
		sc.close();
		
	}

}
