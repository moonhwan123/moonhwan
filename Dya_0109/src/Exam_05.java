import java.util.Scanner;

/*
�Է�
��ȣ ���� ���� ���� 

���
��ȣ ���� ���� ���� ���� ���
 */



public class Exam_05 {
	public static void main(String[] args) {
		
		int score[][] = new int[5][6];
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		
		for(int x = 0; x < score.length; x++) {
			System.out.print((x+1) + "�� �Է� : ");
			score[x][0] = sc.nextInt(); // int b1 = sc.nextInt();
			score[x][1] = sc.nextInt(); // ��
			score[x][2] = sc.nextInt(); // ��
			score[x][3] = sc.nextInt(); // ��
		}

		
		// �Է� �ڷ� ���
		System.out.println("��ȣ\t����\t����\t����");

		for(int x = 0; x < score.length; x++) {
			for(int y = 0; y < score[x].length-2; y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println(); // System.out.print("\n");
		}
		
		// ����, ��� ���� ���
/*	
	   for(int x = 0; x < score.length; x++) {
			score[x][4] = score[x][1]+score[x][2]+score[x][3];
			score[x][5] = score[x][4]/3;
		}
*/		
		
		for(int x = 0; x < score.length; x++) {
			for(int y = 1; y <= 3; y++) {
				score[x][4] += score[x][y];
			}
			score[x][5] = score[x][4]/3;
		}
		
		// ��� �ڷ� ���
		System.out.println("��ȣ\t����\t����\t����\t����\t���");

		for(int x = 0; x < score.length; x++) {
			for(int y = 0; y < score[x].length; y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println(); // System.out.print("\n");
		}
		
		
		
	}
}
