import java.util.Scanner;

/*
�Էµ� ������ ���� 70 ~ 90 �϶� �հ�
�׷��� ������ �ϰ͵� ����

 */
public class Exam_06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		/*
		System.out.print("������ �Է� �ϼ��� : ");
		int jumsu = sc.nextInt();
		
		if(jumsu >= 70) {
			if(jumsu <= 90) System.out.println("�հ�");
		}
		*/

		
		
		/*
		System.out.print("������ �Է� �ϼ��� : ");
		int jumsu = sc.nextInt();
		
		if(jumsu >= 70) {
			if(jumsu <= 90) System.out.println("�հ�");
			else System.out.println("�� ���հ�");
		}
		else System.out.println("�� ���հ�");
		*/
		
		System.out.print("������ �Է� �ϼ��� : ");
		int jumsu = sc.nextInt();
		
		if(jumsu >= 70 && jumsu <= 90) {
			System.out.println("�հ�");
		}
		else System.out.println("���հ�");
		
		
		
		
		sc.close();
	}

}
