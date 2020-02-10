
public class Exam_07 {
	public static void main(String[] args) {
		
		int[] bun = {5,3,1,4,2};
		int[] score = {50,70,60,90,80};
		
		//출력
		//1 	2	  3 	4     5
		//60   80    70    90    50
		
		// 번호가 바뀔때 점수도 같이 바꿔라
		System.out.println("[정렬 전]");
		System.out.print("번호 : \t");
		for(int x = 0; x < bun.length; x++) {
			System.out.print(bun[x]+"\t");
		}
		System.out.println();
		System.out.print("점수 : \t");
		for(int x = 0; x < score.length; x++) {
			System.out.print(score[x]+"\t");
		}
		System.out.println();
		
		
		
		for(int i = 0; i < score.length-1; i++) {
			for(int j = i+1; j < score.length; j++) {
				if(bun[i]>bun[j]) {
					int temp = bun[i];
					bun[i] = bun[j];
					bun[j] = temp;
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		
		System.out.println("[정렬 후]");
		System.out.print("번호 : \t");
		for(int x = 0; x < bun.length; x++) {
			System.out.print(bun[x]+"\t");
		}
		System.out.println();
		System.out.print("점수 : \t");
		for(int x = 0; x < score.length; x++) {
			System.out.print(score[x]+"\t");
		}
		System.out.println();
		
		
	}
}