import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//2019-09-08
		//���� 1��//
		/*
		int A = 20; int B = 25; int C = 30;
		int sum = A + B + C;
		char Que = '?';
		String intro = "Hello? My name is �浿";
		
		System.out.printf("a�� b�� c�� ���� : %d�Դϴ�.\n" , sum);
		System.out.printf("%s \n",intro);
		System.out.printf("%c \n",Que);
		
		System.out.println();
		
		//���� 2��//
		
		
		
		double Pie = 3.14;
		System.out.print("�������� ���̸� �Է� ���ּ��� : ");
		double Ban = sc.nextFloat();
		double result = Ban * Ban * Pie;
		
		System.out.printf("�������� %.1f�� ���� ���̴� %.1f�Դϴ�.",Ban,result);
		
		System.out.println();
		*/
		
		//2019-09-18
		//���� 1��
		/*
		System.out.println();
		System.out.print("���ڸ� �Է� �ϼ��� : ");
		int sut = sc.nextInt();
		int St = 0;
		int Ed = 0;
		
		if (sut>0 && sut<30) {
			if (sut<10 ){
				St = 0;
				Ed = 10;
			}
			else if (sut<20) {
				St = 10;
				Ed = 20;
			}
				
			else if (sut<30) {
				St = 20;
				Ed = 30;
			}
			System.out.printf("%d�̻� %d�̸�",St,Ed);
		}
	
		else
			System.out.println("��ȿ�� ���� �ƴմϴ�.");
		
		sc.close();
		*/
		
		
		//���� 2��
		
		
		//���� 3��
		
		
		
		
		//����,����,�� ���� (random�Լ�)
		
		//int i = (int)(Math.random()*45+1); //������ 0���� 45 �������� +1�� ���ָ� 1���� 45 ���� ����
		//System.out.println(i);
		int user,com;
		String user_tmp;
		String com_tmp;
		
		System.out.print("����(1) ����(2) ��(3) �߿� �ϳ��� �Է� �ϼ��� >>> ");
		user = sc.nextInt();
		com = (int)(Math.random()*3+1);
		user_tmp = "";
		com_tmp = "";
		
		switch(user) {
		case 1 :
			user_tmp = "����";
			break;
		case 2 :
			user_tmp = "����";
			break;
		case 3 :
			user_tmp = "��";
			break;
		}
		switch(com) {
		case 1 :
			com_tmp = "����";
			break;
		case 2 :
			com_tmp = "����";
			break;
		case 3 :
			com_tmp = "��";
			break;
		}
		
		System.out.println("����� "+user_tmp+" �Դϴ�.");
		System.out.println("��ǻ�ʹ� "+com_tmp+" �Դϴ�.");
		
		switch(user-com) {
		case 2: case -1:
			System.out.println("����� �����ϴ�.");
			break;
		case 1: case -2:
			System.out.println("����� �̰���ϴ�.");
			break;
		case 0:
			System.out.println("����� �����ϴ�.");
			break;	
		}
		
		
		
		
		sc.close();
		
		
		
		
		
		
	
	}

}
