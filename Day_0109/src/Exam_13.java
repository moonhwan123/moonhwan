import java.util.Scanner;

/*
Ű���� �Է�(�л����������Է�)(�ִ� 10��)
1. �Է� (��ȣ    �̸�     ����       ����      ����)
�Է� : 1   ȫ�浿    89 80 90
�Է� : 2   �ְ���    3  1  5
�Է� : -99 --> ����

2. ���_1
��ȣ   �̸�   ����   ����   ����   ����   ���   ����

3. ���_2 ������ �������� ���(����)
��ȣ   �̸�   ����   ����   ����   ����   ���   ����

 */



public class Exam_13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[10][6]; // ��ȣ ���� ���� ���� ���� ����
		String name[] = new String[10]; // �̸�
		double ave[] = new double[10]; // ���
		
		
		int cnt = 0;
		//�ڷ� �Է�
		while(cnt < 10) {
			System.out.print("�Է� (��ȣ    �̸�     ����       ����      ����): ");
			arr[cnt][0] = sc.nextInt(); // ��ȣ
			if(arr[cnt][0]== -99) break;
			name[cnt]   = sc.next();    // �̸�
			arr[cnt][1] = sc.nextInt(); // ��
			arr[cnt][2] = sc.nextInt(); // ��
			arr[cnt][3] = sc.nextInt(); // ��
			sc.nextLine();
			cnt++;
		}
		
		//����, ��� ���
		for(int x = 0 ; x < cnt; x++) {
			for(int y = 1; y < 4; y++) {
				arr[x][4] += arr[x][y];
			}
			ave[x] = ((int)(arr[x][4] / 3. * 100 + 0.5))/100.; // ���
		}
		
		//���� ��� 
		for(int x = 0 ; x < cnt; x ++) {
			int r = 1; // ���� ����
			for(int y = 0; y < cnt; y++) {
				if(arr[x][4]<arr[y][4]) { // �������� 
					r++;
				}
			}
			arr[x][5] = r;
		}
		//���
		System.out.println("��ȣ\t����\t����\t����\t����\t���\t����");
		for(int x = 0; x < cnt; x++) {
			System.out.print(arr[x][0]+"\t");
			System.out.print(name[x]+"\t");
			for(int y = 1; y<5; y++) {
				System.out.print(arr[x][y]+"\t");
			}
			System.out.print(ave[x]+"\t");
			System.out.print(arr[x][5]);
			System.out.println();
		}


		//������ �������� ���� ���� ����
		for(int x = 0; x < cnt; x++) {
			for(int y = x+1; y < cnt;y++) {
				if(arr[x][4]<arr[y][4]) { 
					for(int k = 0; k < 6; k++) {
						int temp = arr[x][k];
						arr[x][k] = arr[y][k];
						arr[y][k] = temp;
					}
					double temp2 = ave[x];
					ave[x] = ave[y];
					ave[y] = temp2;
					String temp3 = name[x];
					name[x] = name[y];
					name[y] = temp3;
				}
			}
		}
		
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
		for(int x = 0; x < cnt; x++) {
			System.out.print(arr[x][0]+"\t");
			System.out.print(name[x]+"\t");
			for(int y = 1; y<5; y++) {
				System.out.print(arr[x][y]+"\t");
			}
			System.out.print(ave[x]+"\t");
			System.out.print(arr[x][5]);
			System.out.println();
		}
		
		
	}
}
