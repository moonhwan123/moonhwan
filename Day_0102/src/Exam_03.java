import java.util.Scanner;

/*
������� ��� ���α׷� �ۼ�
Ű����� ������ȣ, �����ð�(��) �� �Է�

��) 
	������ȣ : 1234
	�����ð� : 42
	
	������� ��� 
	������ȣ	���
	1234	1500��
	
�������� �ð��� �ִ� �Ϸ�(24�ð�)
��������� 10�й̸��� ����, 30�б��� 500��,
30������ ���ʹ� 10�д� 500�� ���
�Ϸ���������� �ִ� 30,000������ ����ϸ�, 30,000���� �ʰ� �ϴ��� 30,000���� ¡��


 */



public class Exam_03 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("���� ��ȣ : ");
		int car_num = sc.nextInt();
		System.out.print("���� �ð�(��) : ");
		int parking_time = sc.nextInt();
		
		int parking_fee = 0;
		
		
		if(parking_time<10) {
			parking_fee = 0;
		}
		else if(parking_time < 30) {
			parking_fee = 500;
		}
		else{
			parking_fee = 500 + ((parking_time-21)/10 * 500);
			if(parking_fee > 30000) parking_fee = 30000;
		}
		
		System.out.println("������ȣ\t���");
		System.out.println(car_num+"\t"+parking_fee+"��");
		
		
		
		
	}

}
