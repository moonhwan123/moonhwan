/*
10���� �迭�� ����� ������ �� �ִ�, �ּҰ� ã��

 */


public class Exam_07 {
	public static void main(String[] args) {
		
		int score[] = {90,44,77,88,67,94,83,54,86,57}; 
		
		int max = score[0];
		int min = score[0];
		
		for(int x = 1; x < score.length; x++) {
			if(max<score[x]) {
				max = score[x];
			}
			if(min>score[x]) {
				min = score[x];
			}
		}
		//���
		System.out.print("�Է� �ڷ� : ");
		for(int x = 0; x < score.length; x++) {
			System.out.print(score[x]+"\t");
		}
		System.out.println();
		System.out.println("�ִ� �� : " + max);
		System.out.println("�ּ� �� : " + min);
		
		
		
	}

}
