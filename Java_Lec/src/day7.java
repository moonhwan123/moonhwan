import java.util.Scanner;

public class day7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 -�ݺ���
		 	: ���ǿ� �����ϸ� �����Ѵ�.(���ǹ��� ����)
		 		>��, ���ǿ� �������� ������ ����
		 		
		 	1. while��
		 		���ǽ��� ���̸� ��ɹ� ����
		 		if���� �⺻������ ����
		 			>if�� : ������ ���̸� �����ϰ� ��
		 			>while�� : ������ ���̸� �����ϰ� �ٽ� ���ǽ��� ��
		 			
		 			
		 	2. do~while��
		 		while���� ������ ����
		 		��ɹ��� ���� �� ������ �˻� 
		 		�ּ� �ѹ��� ��ɹ��� ����ȴ�.
		 		
		 	3. for��
		 		Ư���� Ƚ������ �۾� �ݺ�
		 		�ʱ�ȭ,���ǽ�,������
		 		
		 		
		 		
		 -�ݺ��� ���� ����
		 
		 	break�� : �ݺ����� ���� ������. (Ż��)
		 	continue�� : �ݺ����� ù �������� ���� ����. (���ǽ� �˻��Ϸ� �ö�)
		 	
		
		 			
		 */
		
		
		/*
		int num = 0;
		while(num<3) {
			System.out.println(num);
			num++; 
		}
		System.out.println("End"); //�ݺ����� ������ ����ȴ�.
		System.out.println();
		*/
		
		
		
		// (1) num = 0, 0<3 �����Ͽ� ���� (print �� num++����)
		// (2) num = 1, 1<3 �����Ͽ� ���� (print �� num++����)
		// (3) num = 2, 2<3 �����Ͽ� ���� (print �� num++����)
		// (4) num = 3, 3<3 �������� �ʾƼ� �� 
		// ���� �� -> ���� -> ���� -> ���� �� ....... �ݺ�
		
		
		/*
		-���Ǻ���
			: ���Ǻ����� ���� �ݺ�Ƚ���� ��������.
		
		 �ʱⰪ (���� ���� ����)
		 while(���ǽ�) ->(���Ǻ��� ���)
		 	��ɹ�(�ݺ� �����ϰ� ���� �ڵ� + ���Ǻ����� ��ȭ��)
		 	
		 	���Ǻ����� ��ȭ���� �󸶵��� �����Ӱ� ��밡��
		 	��, ���ǽ��� �����ϵ��� ����
		 	
		 */
		
		
		
		//�ݺ�Ƚ�� ����
		/*
		int count;
		
		System.out.print("�ݺ� Ƚ�� �Է� : ");
		count = sc.nextInt();
		while(count>0)
		{
			System.out.println("count = " +count);
			count--;
		}
		*/
		
		
		
		/*
		System.out.println();
		
		
		int i = 6;
		while(--i != 0)
		{
			System.out.println(i);
			
		}
		*/
		
		
		
		// �ݺ�Ƚ�� ����
		// 1~9 ���� ���� ����
		
	
		// ��ɹ� ���� ����� �ݺ��� ����°� ���ϴ�
		
		
		
		
		/*  ���� ����
		 1~10 ���� �� ���ϱ�
		 [��� ���]
		 1~10 ������ ���� 55�̴�.
		 */
		/*
		System.out.println();
		int K = 0;
		int sum_K = 0;
		
		while(K<11) {
		sum_K += K;
		K++;
		}
		System.out.println(sum_K);
		*/
		
		
		
		
		
		
		
		//Ư�� ������ �����ϸ� Ż���ϴ� �ݺ���
		/*
		int num;
		int sum = 0;
		boolean flag = true;
		
		while(flag) {
			System.out.print("���� �Է� >>");
			num = sc.nextInt();
			
			if(num != 0) {
				sum+=num;
			}
			else {
				flag = false;
			}
		}
		System.out.println("�Է��Ͻ� ���� ���� "+sum+"�Դϴ�.");
		*/
		
		/*
		 �Է� ���� �� ������ ����ϱ�
		 [��°��]
		 ���� �Է� �ϼ��� : 5
		 
		 5 * 1 = 5
		 5 * 2 = 10
		 .
		 .
		 .
		 */
		/*
		int M = 0;
		int result;
		System.out.print("���� �Է� �ϼ��� : ");
		int dan = sc.nextInt();
		
		
		while(M<9) {
		M++;
		result = dan * M;
		System.out.printf("%d * %d = %d \n", dan , M , result);
		}
		*/
		
		/*
		int num = 0;
		
		do {
		System.out.println("=================");
		System.out.println("1. ���θ����");
		System.out.println("2. �ҷ�����");
		System.out.println("3. �ɼ�");
		System.out.println("4. ������");
		System.out.println("=================");
		System.out.print("���� : ");
		num = sc.nextInt();
		}while(num < 1 || num > 4); // ���� �ݷ� ����
		
		System.out.println("������ �޴��� = "+num);
		*/
		
		
		
		/*
		 ���� ���߱�
		 1~100 ���� �������� ���� ���ڸ� ����
		 �ݺ��� �տ��� ���ڸ� �Է� �ް�, ���ڰ� �����̸� Ż��
		 
		 [��� ���]
		 ���� �Է� : 50
		 �� ū ���� �Է� �ϼ���
		 ���� �Է� : 80
		 �� ���� ���� �Է� �ϼ���
		 �� �� �Է� : 70
		 �����Դϴ�!
		 3ȸ ���� ���� �̽��ϴ�.
		 */
		
		/*
		int ran_sut,ip_sut;
		int count = 0;
		ran_sut = (int)(Math.random()*100+1);
		
		do {
			System.out.print("���� �Է� : ");
			ip_sut = sc.nextInt();
			count++;
			
			if (ip_sut > ran_sut) 
				System.out.println("�� ���� ���� �Է� �ϼ���");
			else if (ip_sut < ran_sut) 
				System.out.println("�� ū ���� �Է� �ϼ���");
			else {
				System.out.println("���� �Դϴ�!");
				break;
			}
		}while(true);
		
		System.out.println(count+"ȸ ���� ���߼̽��ϴ�.");
		*/
		
		
		//break��
		//�ݺ��� ����
		//������ �ݺ��� Ż��
		
		/*
		int sum = 0;
		int i = 0;
		while(true) {
			if(sum>500)
				break;
			++i;
			sum+=i;
		}
		System.out.println("i = "+i);
		System.out.println("sum = "+sum);
		*/
		
		
		
		//continue��
		//���ǽ����� ����
		/*
		int num = 0;
		int sum = 0;
		
		while(num<=100) {
			if(num % 3 == 0) {
				num++;
				continue;
			}
				
			sum+=num;
			num++;
		}
		System.out.println("���� : "+sum);
		*/
		
		
		
		// 0 ���� �����ؼ� 99���� ¦������ ���� ���ϴ� ���α׷�
		
		/*
		int num = 0;
		int sum = 0;
		
		while(num<99) {
			if(num % 2 != 0) {
				num++;
				continue;
			}
		
		sum+=num;
		num++;
		}
		System.out.println("0���� 99���� ¦���� ���� : "+sum);
		*/
		
		/*
		int num = 0;
		for(num = 0; num < 10; num++) {
			System.out.println(num);
		}
		*/
		
		// ������ (�Է� ���� ���� ���)
		/*
		int dan;
		int gop = 0 ;
		int result = 0;
		
		System.out.print("���� �Է� �ϼ��� >> ");
		dan = sc.nextInt();
		
		
		for(gop = 1; gop < 10; gop+=1) {
			result = dan * gop;
			System.out.printf("%d * %d = %d\n", dan, gop,result);
		}
		*/
		
		//�ΰ��� �ʱⰪ �ΰ��� ������
		/*
		for(int i=1 , j=10; i<10; i++,j--)
			System.out.printf("%d \t %d\n",i,j);
		System.out.println();
		*/
		// ��ø �ݺ���
		/*
		for(int J = 1; J<=5; J++)
		{
			for(int A = 1; A<=5; A++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		System.out.println();
		
		// ������(2~9�� ����ϱ�)
		int Dan=0;
		int W=0;
		int Result=0;
		
		for(Dan=2; Dan<=9; Dan++) {
			for(W=1; W<=9; W++) {
				Result = Dan * W;
				System.out.printf("%d * %d = %d \n",Dan,W,Result);
			}
			System.out.println();
		}
			
		
		/*
		 o
		 oo
		 ooo
		 oooo
		 ooooo
		 */
		
		int hang=0;
		int yull=0;
		
		for(hang = 0; hang<=4; hang++) {
			for(yull = 0; yull<=hang; yull++) {
				System.out.print("o");
			}
			System.out.println();
		}
		
		// �̸����� �ݺ���
		Loop1: for(int i = 2; i<= 9; i++) {
			for(int j = 1; j<= 9; j++) {
				System.out.printf("%d X %d = %d \n",i,j,(i*j));
				if(j==5)
				continue Loop1; // �̸� ���ΰ����� �̵�
			}
			System.out.println();
		}
		
		
		
		
	}

}
