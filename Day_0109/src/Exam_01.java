/*
������ �迭
 */



public class Exam_01 {
	public static void main(String[] args) {
		
		int score[][] = {{1,90,78,79},{5,95,80,70},
				{2,79,88,77},{4,75,88,77},{3,95,88,75}};
		
		//�Է��ڷ� ���
		System.out.println("��ȣ\t����\t����\t����");
/*		
		for(int x = 0; x < score.length; x++) {
			System.out.print(score[x][0]+"\t");
			System.out.print(score[x][1]+"\t");
			System.out.print(score[x][2]+"\t");
			System.out.print(score[x][3]+"\n");
		}
*/

		
		for(int x = 0; x < score.length; x++) {
			for(int y = 0; y<score[x].length; y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println();
		}
		
		
		
		
	}
}
