import java.util.Scanner;

public class mondai {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�ִ�����
		/*
		 �� ���� �ִ� ����� ���ϱ�
		 
		 ��Ŭ���� ȣ����
		 1. �� �� ��� ū ���� big, �������� small��� �Ѵ�.
		 2. y�� 0�̸� ������� x�� ����.
		 3. nmg = big % small
		 4. big = small
		 5. small = nmg
		 */
		
		
		
		/*
		int A;
		int B;
		int big;
		int small;
		int nmg;
		
		System.out.println("�� ���� �Է� ���ּ��� : ");
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A>B) {
			big = A;
			small = B;
		}
		else {
			small = A;
			big = B;		
		}
		
		while(small != 0) {
		nmg = big % small;
		big = small;
		small = nmg;
		}
		System.out.println("�ִ� �������"+big);
		*/
		
		
		
		// ================================================================(09-20)
		
		
		
		/*
		 0 ������ ���� �Է� �� �� ���� ������ ��� �Է� �ް� 5�� ����� 7�� ����� ������ ������ ������ ����ϴ� ���α׷�
		 
		 [��°��]
		 ���� �Է� �ϼ��� : 100 80 20 28 3 34 2 0
		 5�� 7�� ����� ������ ���� : ~~
		 */
		
		/*
		int num=0;
		int count=0;
		System.out.print("���� �Է� �ϼ��� : ");
		
	
		while(true)
		{
			num = sc.nextInt();
			if (num<= 0)
				break;
			if(num % 5 != 0 && num % 7 != 0)
				count++;
		}
		
		System.out.println();
		System.out.println("5�� 7�� ����� ������ ������ "+count+"�� �Դϴ�.");
		*/
		
		
		// 2019-09-19 [�ǽ� ���� 2��]
		
		
		
		/*
		int A;
		int B;
		System.out.print("�� ���� �Է� �ϼ��� : ");
		A= sc.nextInt();
		B= sc.nextInt();
		int DAN;
		int GOP;
		int RESULT;
		
		if(A>B) {
			int tmp = A;
			A = B;
			B =tmp;
		}
		
		for(DAN=A; DAN<=B; DAN++) {
			
			for(GOP=1; GOP<=9; GOP++) {
				RESULT = DAN * GOP;
				System.out.printf("%d * %d = %d \n",DAN,GOP,RESULT);	
			}
		}
		*/
		
		/*
		int A;
		int B;
		System.out.println("�� ���� �Է� �ϼ��� : ");
		A= sc.nextInt();
		B= sc.nextInt();
		int DAN;
		int GOP;
		int RESULT;
		
		for(DAN=A; DAN<=B; DAN++) {
			System.out.println("");
			for(GOP=1; GOP<=9; GOP++) {
				RESULT = DAN * GOP;
				System.out.print(DAN+"*"+GOP+"="+RESULT+"\t");	
			}
		}
		*/
		
		//[���� 3��]
		// �ʸ� �Է� �ް� ~��~�� ~�� �� ���·� ��Ÿ����
		/*
		System.out.print("�ʸ� �Է� �ϼ��� : ");
		int time = sc.nextInt();
		int second = time % 60;
		int minute = (time/60) % 60;
		int hour = (time/60) / 60;
		
		System.out.printf("%d�ʴ� %d�ð� %d�� %d�� �Դϴ�.", time,hour,minute,second);
		System.out.println();
		*/
		
		
		//for�� �ϳ��� ���� ������ 
		
		int dan = 1;
		int gob = 0;
		for (int i = 9; i < 81; i++) {
			dan = i/9+1;
			gob = i%9+1;
			System.out.printf("%d * %d = %d \n",dan,gob,dan*gob);
		}
		
		
		
		//
		
		
		
		
		
		
		
		
		
		
		
	}

}
