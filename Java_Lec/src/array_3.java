import java.util.Arrays;
import java.util.Scanner;

public class array_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�ܾ� ���߱�
		/*
		String[][] words = {
				// 0,0    0,1
				{"chair","����"},
				{"computer","��ǻ��"},
				{"integer","����"}
		};
		
		
		
		for(int i = 0 ; i < words.length; i++) {
			System.out.printf("Q%d. %s �� ����?", i+1,words[i][0]);
			String tmp = sc.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.println("���� �Դϴ�. \n\n");
			
			}
			else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s �Դϴ�.\n\n",words[i][1]);
			}
		}
		*/
	
		
	// �Է¹��� ���ڸ�ŭ�� ���� ������ �簢�� ä���
	// (�������, ������, ������)
		
		//�Ϲ�
		/*
		System.out.print("���ڸ� �Է� �ϼ��� >");
		int num = sc.nextInt();
		int cnt = 1;
		int[][] lec = new int[num][num];
		
		
		for(int i = 0; i < lec.length; i++) {
			for(int j = 0; j < lec.length; j++) {
				lec[i][j] = cnt;
				cnt++;
				System.out.printf("%d \t",lec[i][j]);
			}
			System.out.println();
		}
		*/
		
		
		//�������
		System.out.println("���� ��� �迭");
		System.out.print("���ڸ� �Է� �ϼ��� >");
		int num = sc.nextInt();
		int cnt = 1;
		int[][] lec = new int[num][num];
		
		for(int i = 0; i < lec.length; i++) 
		{
			if(i%2 == 0) 
			{
			for(int j = 0; j < lec.length; j++) {
					lec[i][j] = cnt;
					cnt++;
					}
			}
			else 
			{
				for(int j = lec.length-1; j >= 0; j--){
					lec[i][j] = cnt;
					cnt++;
				}
			}
			
		}
		for(int i = 0; i < lec.length; i++) {
			for(int j = 0; j < lec.length; j++) {
				System.out.printf("%3d \t",lec[i][j]);
			}
			System.out.println();
		}
		
		
		
	// 10���� ������ 1���� �迭�� �Է� �ް� �ִ�,�ּ�,��,��� ���ϱ�
		
		/*
		int sum = 0;
		double ava = 0;
		int[] NUM = new int[10]; 
		
		System.out.print("������ �Է� �� �ּ��� > ");
		
		for(int I = 0; I < NUM.length; I++) {
		NUM[I] = sc.nextInt();
		sum = sum+NUM[I];
		}
		
		ava = sum/NUM.length;
		Arrays.sort(NUM);
		
		System.out.printf("�ִ� : %d \n",NUM[0]);
		System.out.printf("�ּ� : %d \n",NUM[9]);
		System.out.printf("�հ� : %d \n",sum);
		System.out.printf("��� : %.2f \n",ava);
		*/
		
		System.out.println();
		
		
		
		
		
	// ���̰� 10�� �迭�� �����ϰ�, ���ڸ� �� �迭�ȿ� �Է� ���� �� -> �Է� ������ : Ȧ�� �϶� �迭�� �� ���� // �Է� �������� : ¦�� �迭�� �� ����	
		
		/*
		int bae[] = new int[10];
		int num_2,front = 0, rear = 9;
		
		System.out.println("�� 10���� ���� �Է� > ");
		
		for(int i_2 = 0; i_2 < bae.length; i_2++) 
		{
			
			System.out.print("? : ");
			num_2 = sc.nextInt();
			
			if(num_2 % 2 != 0) {
				bae[front] = num_2 ;
				++front;
			}
			else {
				bae[rear] = num_2 ;
				--rear;
			}
			
			
		}
		System.out.println("�迭 ��� ���");
		for(int i_2 = 0; i_2 < bae.length; i_2 ++) {
			System.out.print(" "+bae[i_2]);
		}
		*/
		
		

		
		
		
		
		
		

	}

}
