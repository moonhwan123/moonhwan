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


public class Exam_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] str = {'0','1','2','3','4','5','6'
				,'7','8','9','A','B','C','D','E','F'};
		
		char bin[];
		
		while(true) {
			bin = new char[12];
			String binary = "";
			int cnt=0;
			System.out.print("10���� : ");
			int dec = sc.nextInt();
			if(dec == -99) break;
			System.out.print("��ȯ �ϰ� ���� ���� �Է�(2,8,16) : ");
			int jin = sc.nextInt();
			
			if(dec >= 2 && dec <= 3000) {
				int temp = dec;
				int mok;
				int nmg;
				do {
					mok = temp/jin;
					nmg = temp%jin; 
					bin[cnt] = str[nmg]; // �迭 �̿�
					binary = str[nmg]+binary; // ���ڿ� ���� �̿�
					temp = mok;
					cnt++;
				}while(mok!=0);
				System.out.print(jin+"���� : ");
				for(int j = cnt-1; j >= 0; j--) {
					System.out.print(bin[j]);
				}
				System.out.println();
				System.out.println(jin+"���� : " +binary);
			}else System.out.println("�Է� ����");
		}
	
		
	}

}