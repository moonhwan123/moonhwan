/*
������ �迭
 */



public class Exam_11 {
	public static void main(String[] args) {
		
		int score[][] = {{1,90,78,79,0,1},{5,95,80,70,0,1},
				{2,79,88,77,0,1},{4,75,88,77,0,1},{3,95,88,75,0,1}};
		
		//�Է��ڷ� ���
		System.out.println("��ȣ\t����\t����\t����");
		for(int x = 0; x < score.length; x++) {
			for(int y = 0; y<score[x].length-2; y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println();
		}
		//���� ���
		for(int x = 0 ; x < score.length; x++) {
			for(int y = 1; y < 4; y++) {
				score[x][4] += score[x][y];
			}
		}
		//���� ��� (�⺻ ����� 1�� ���� ������)
		for(int x = 0 ; x < score.length; x ++) {
			for(int y = 0; y < score.length; y++) {
				if(score[x][4]<score[y][4]) { // �������� 
					score[x][5]++;
				}
			}
		}
	

		
		//��ȣ�� �������� ���� ���� ����
		for(int x = 0; x < score.length; x++) {
			for(int y = x+1; y < score.length;y++) {
				if(score[x][0]>score[y][0]) { // ��ȣ�� �����̱� ������ [x][0]
					for(int k = 0; k < score[0].length; k++) {
						int temp = score[x][k];
						score[x][k] = score[y][k];
						score[y][k] = temp;
					}
				}
			}
		}
		
		
		//���
		System.out.println("��ȣ\t����\t����\t����\t����\t����");
		for(int x = 0; x < score.length; x++) {
			for(int y = 0; y<score[x].length; y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println();
		}
		
		
	}
}
