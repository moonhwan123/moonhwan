/*
int[] a = new int[10];
�϶�
a -> ù ��° ����� �ּҰ� (������ X)
a[0] -> �� ����ü
a.length -> �迭�� ���� (�̰�쿣 10)
 */
public class Exam_01 {
	
	public static void main(String[] args) {
		
		int[] score; // �迭 ����
		score = new int[10]; // ���� �Ҵ�(�޸� ���� Ȯ��) , �ڵ� �ʱ�ȭ(�⺻������)
		score[0] = 10;
		score[1] = 20;
//		score[10] = 100; // ��Ÿ�ӿ��� �߻�
		
		System.out.println(score);
		System.out.println(score[0]);
		System.out.println(score.length);
		
		
		
		
		
		
		
		
	}

}
