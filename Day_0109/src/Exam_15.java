import java.util.Scanner;

/*
Ű����� (��ȣ �̸� ���� ���� ���� ����)
�Է� : 1  ȫ�浿  77 88 99 80 
.	.	.
�Է� : -99 --> �Է�����(�ִ� 10��)

���
��ȣ   �̸�   ����   ����   ����   ����   ����   ���(������)
.
.
�հ�             xx  xx   xx  xx  xx  xx
���             xx  xx   xx  xx  xx  xx

��ü ��� �̻��� �л��� �ؿ��ٰ� ���
��ȣ   �̸�   ���
 x   x   x
 */

public class Exam_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[11][7];
		String[] name = new String[10];
		double[] ave = new double[6];
		int cnt;
		//�Է� �κ�
		for(cnt = 0; cnt < 10; cnt++) {
			System.out.print("�Է�(��ȣ �̸� ���� ���� ���� ����) : ");
			arr[cnt][0] = sc.nextInt(); // ��ȣ
			if(arr[cnt][0]==-99)break;
			name[cnt] = sc.next();
			arr[cnt][1] = sc.nextInt(); // ����
			arr[cnt][2] = sc.nextInt(); // ����
			arr[cnt][3] = sc.nextInt(); // ����
			arr[cnt][4] = sc.nextInt(); // ����
			sc.nextLine();
			arr[cnt][5] = arr[cnt][1] + arr[cnt][2] + arr[cnt][3] + arr[cnt][4]; 
			arr[cnt][6] = arr[cnt][5]/4;
		}
		//�հ� ���ϴ� �κ�
		for(int x = 0; x < cnt; x++) {
			for(int y = 1; y < 7; y++) {
				arr[10][y] += arr[x][y]; 
			}
		}
		//���
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t����\t���");
		for(int x = 0; x < cnt; x++) {
			System.out.print(arr[x][0]+"\t");
			System.out.print(name[x]+"\t");
			for(int y = 1; y<7; y++) {
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}
		System.out.println("============================================================");
		
		//�հ� ��� �κ�
		System.out.print("�հ� : "+"\t\t");
		for(int x = 1 ; x < arr[0].length; x++) {
			System.out.print(arr[10][x]+"\t");
		}
		
		//��� ��� �κ�
		System.out.println();
		System.out.print("��� : "+"\t\t");
		for(int x = 0 ; x < ave.length; x++) {
			ave[x] = (int)(arr[10][x+1]/(double)cnt*100+0.5)/100.;
			System.out.print(ave[x]+"\t");
		}
		System.out.println();
		//��ü ��� �̻��� �л�
		System.out.println("[��ü ��� �̻��� �л�]");
		System.out.println("��ȣ\t�̸�\t���");
		for(int x = 0; x < cnt; x++) {
			if(arr[x][6]>ave[5]) {
				System.out.print(arr[x][0]+"\t");
				System.out.print(name[x]+"\t");
				System.out.println(arr[x][6]);
			}
		}
		
		
		
	}

}
