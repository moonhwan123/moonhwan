import java.util.Scanner;

public class day5_2 {

	public static void main(String[] args) {
		
		/*
		 -���ǹ�
		 	: Ư���� ������ �����ϸ� ��ɹ��� ����
		 	
		 	if��
		 		: �⺻���� ���ǹ�
		 		: ������ ���� �� ����
		 		: ���� ~~��
		 			'����' ���ǿ� �����ϸ� �����϶�.
		 			�����ϴ� = True
		 			�������� �ʴ´� = False
		 		if (���ǽ�)
		 			��ɹ�
		 			//���� ��ɹ� ������{}
		 			 { 
		 				��ɹ�
		 				��ɹ�
		 			 } 
		 			 
		 		else
		 			: ���ǽ��� �������� ������ '������' ���⸦ ����
		 			: if���� ���ӵȴ�.
		 			: if�� �ϳ��� �ϳ��� ��� ����
		 */
		
		int a = 5;
		
		if (!(a>3))
		{
			System.out.println("a�� 3���� ũ��.");
		}
		
		System.out.println("�˻� ��");
		
		
		//���� �ϳ� �Է� �ް�, ȭ�鿡 ���� ��� (��, 0�̸� "�Է��Ͻ� ���ڴ� 0�Դϴ�.")
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("���ڸ� �Է� �ϼ��� : ");
		int num = sc.nextInt();
		
		if(num != 0)
		{
		System.out.println("�Է� �Ͻ� ���ڴ� "+num+"�Դϴ�.");
		}
		
		else
		{
			System.out.println("�Է��Ͻ� ���ڴ�"+num+"�Դϴ�.");
		}
		*/
		
			
		// ���� �����
		// 4�� ������ ��������
		// 100���� ������ ���� ���� ������ �����̴�.
		// �׸��� ���� 400���� ������ �������� ����
		// �⵵ �Է� �� �������� �ƴ����� �Ǻ� 
		
		System.out.println("�⵵�� �Է� �ϼ��� : ");
		int year = sc.nextInt();
		
		if((year%4 ==0 && year %100 != 0)|| year%400==0)
		{
			System.out.println(year+"���� �����Դϴ�.");
		}
		else
			
			System.out.println(year+"���� ������ �ƴմϴ�.");
		
		
		sc.close();

	}

}
