import java.util.Arrays;
import java.util.Scanner;

public class day8 {

	public static void main(String[] args) {
		
		
		/*
		 -�迭[Array]
		 	: ���� �ڷ����� ����
		 	: ���� ���� ���� �ٷ� �� �����ϴ�
		 	: �迭�� �� ��Ҵ� ���������� �̷���� �ִ�
		 	 
		 -�迭�� ����
		 	: �ڷ����̳� �����̸� �ڿ� ���ȣ[]�� �ٿ��� ����
		 	: �ڷ���[] �����̸�; -> int[] score;
		 	: �ڷ��� �����̸�[]; -> int score[];
		 	
		  üũ) �迭�� �����Ѵٰ� �ؼ� ���� ������ ������ �������� �ʴ´�.
		  	   �ʿ��� ������ ����
		  	   
		  -�迭�� ����
		  	: int[] score; // �迭�� �����Ѵ�.
		  	: score = new int[5]; // �迭�� �����Ѵ�. 
		  	
		  -�迭�� �ʱ�ȭ
		  	: ������ �迭�� ó������ ���� ����
		  	int[] score = {100,90,60,70,20};
		  	int[] score = new int[]{100,90,60,70,20}
		 
		 */

		int[] score = {100,90,80,70,60};
		System.out.println(score);
		System.out.println();
		/*
		 -�迭�� ���̿� �ε���
		 	: �迭�� �������� �ٿ��� ��ȣ
		 	: �ε��� ��ȣ�� 0������ �ο��ȴ�
		 	: �ε����� ���̴� ������ ũ���� -1
		 */
		
		int[] student = new int[3];
		System.out.println("���� �ڵ� �ʱ�ȭ �� ù ��° ����� �� = "+student[0]); // new�� �ڵ������� �ʱ�ȭ�ȴ�.
		student[0] = 30;
		student[1] = 20;
		student[2] = 10;
		
		//int[] student = new int[]{30,20,10}; ������ ���� ����
		
		System.out.println("���� ù ��° ����� �� = "+student[0]);
		System.out.println("���� �� ��° ����� �� = "+student[1]);
		System.out.println("���� �� ��° ����� �� = "+student[2]);
		
		System.out.println();
		
		for(int i = 0; i<3; i++) {
			System.out.println(i+"��° �迭�� �� = "+student[i]);
		}
		
		int a[] = new int[] {10,20,30,40,50};
		int b[] = {1,2,3,4,5,6,7};
		int c[] = new int[10];
		
		for(int index_num = 0; index_num <c.length; index_num++) {
			c[index_num]=index_num;
		}
		
		for(int index_num = 0; index_num <c.length; index_num++) {
			System.out.println(c[index_num]);
		}
		
		System.out.println(Arrays.toString(c));
		System.out.println();
		
		// ��� �� ���ϱ�
		// 5�� ���� ��� (Scanner�� �Է�)
		
		/*
		 [��°��]
		 ���� �Է� : 80
		 ���� �Է� : 80
		 ���� �Է� : 80
		 ���� �Է� : 80
		 ���� �Է� : 80
		 ��� ������ 80.00 �Դϴ�.
		 
		 // �߰� ���� -1�� �Է��ϱ� ������ �Է� �ް� ��հ� ���ϱ�
		 */
		Scanner sc = new Scanner(System.in);
		/*
		int jumsu[] = new int[5];
		int sum = 0;
		double ava = 0;
		
		for(int N = 0; N < jumsu.length; N++) {
			System.out.print("���� �Է� : ");
			jumsu[N] = sc.nextInt();
			sum = sum + jumsu[N]; 
			ava = sum /jumsu.length;
		}
		System.out.printf("��� ������ %.2f�� �Դϴ�. \n",ava);
		*/
		
		//Arrays API ��
		
		//CopyOf()
		//���� ���� �迭�� Ư�� ���̸�ŭ�� ���ο� �迭�� �����Ͽ� ��ȯ
		
		int[] arr1 = {1,2,3,4,5};
		//int[] arr2 = new int [5];
		
		
		int[] arr2 = Arrays.copyOf(arr1,3);
		for(int i = 0 ; i < arr2.length; i++) {
			System.out.println(arr2[i]+"");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr2));
	
		//copyOfRange()
		//���� ���� �迭�� Ư�������� �ش��ϴ� ��Ҹ��� ���ο� �迭�� �����Ͽ� ��ȯ
		//�Ű������δ� ���� �迭���� ������ ���� �ε����� ���� �ް�, ����° �Ű������δ� ���������� ����� �迭 ����� �ٷ� ���� �ε����� ����
		
		int[] arr3 = Arrays.copyOfRange(arr1, 2, 4);
		System.out.println(Arrays.toString(arr3));

		
		
		//fill()
		//���޹��� �迭�� ��� ��Ҹ� Ư�� ������ �ʱ�ȭ
		
		int arr[] = new int[10];
		Arrays.fill(arr, 7);
		System.out.println(Arrays.toString(arr));
		
		
		
		//sort()
		//���޹��� �迭�� ��� ��Ҹ� ������������ ����
		
		int arr4[] = {5,3,1,2,4};
		
		Arrays.sort(arr4);
		System.out.println(Arrays.toString(arr4));
		System.out.println();
		
		//
		char[] abc = {'A','B','C','D'};
		char[] num = {'0','1','2','3','4','5','6'};
		
		System.out.println(abc);
		System.out.println(num);
		
		char[] result = new char[abc.length + num.length];
		
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		
		System.out.println(Arrays.toString(result));
		
		
	}

}
