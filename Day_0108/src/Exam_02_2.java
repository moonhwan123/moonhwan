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


public class Exam_02_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int bin[];
		while(true) {
			bin = new int[10];
			int cnt=0;
			System.out.print("10���� : ");
			int dec = sc.nextInt();
			if(dec == -99) break;
			if(dec >= 2 && dec <= 1024) {
				int temp = dec;
				int mok;
				int nmg;
				do {
					mok = temp/2;
					nmg = temp%2; 
					bin[cnt] = nmg;
					temp = mok;
					cnt++;
				}while(mok!=0);
				System.out.print("2���� : ");
				for(int j = cnt-1; j >= 0; j--) {
					System.out.print(bin[j]);
				}
				System.out.println();
			}else System.out.println("�Է� ����");
		}
	
		
	}

}
