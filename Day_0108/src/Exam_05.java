
public class Exam_05 {
	public static void main(String[] args) {
		
		int[] score = {50,70,60,90,80};
		System.out.print("Data(������) : ");
		for(int x = 0; x < score.length; x++) {
			System.out.print(score[x]+"\t");
		}
		System.out.println();
		
		//�������� �۾� (�տ������� ���� �����Ǹ鼭 �ٲ�)
		for(int x = 0 ; x < score.length-1; x++) { //���ذ��� ��ȭ
			for(int y = x+1 ; y < score.length; y++) { //�񱳰��� ��ȭ
				if(score[x] > score[y]) { // ��������
					int temp = score[x];
					score[x] = score[y];
					score[y] = temp;
				}
			}
		}
		
		System.out.print("Data(������) : ");
		for(int x = 0; x < score.length; x++) {
			System.out.print(score[x]+"\t");
		}
		System.out.println();
		
		
		
		
	}
}
