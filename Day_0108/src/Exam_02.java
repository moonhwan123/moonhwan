import java.util.Scanner;

/*
Ű���� (2~1024)�Է�
�Է� ���� 2���� ��ȯ�ؼ� ���
�Է� ���� -99 �̸� ���� 

����)
�Է� : 10 
2���� : 1010
�Է� : 1
�Է� ����
�Է� : 127
2���� : 1111111
 */


public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int bin[] = new int[10];

 		//���� �Է�
		while(true) {
	 		int cnt = 0;
			System.out.print("2~1024 ������ ������ �Է� �ϼ���(-99�Է½� ����) >>");
			int num = sc.nextInt();
			if(num==-99) break;
			if(num >= 2 && num <= 1024) {
		 		int mok, nmg;
				int temp = num;
				do{
					mok = temp/2;
					nmg = temp%2;
					bin[cnt] = nmg;
					temp = mok;
					cnt++;
				}while(mok!=0);	
				System.out.println("10���� : "+num);
				System.out.print("2���� : ");
				for(int j = cnt-1; j >= 0; j--) {
					System.out.print(bin[j]);
				}
				System.out.println();
			}else System.out.println("�Է� ���� !");
		}
		
		
		
		
		
	}

}
