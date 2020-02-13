
public class Exam_06 {
	public static void main(String[] args) {
		
		int[] score = {50,70,60,90,80};
		System.out.print("Data(정렬전) : ");
		for(int x = 0; x < score.length; x++) {
			System.out.print(score[x]+"\t");
		}
		System.out.println();
		
		//버블정렬 작업 (뒤에서부터 값이 고정되면서 바뀜)
		for(int x = 0 ; x < score.length-1; x++) { 
			for(int y = 0 ; y < score.length-1-(x); y++) { 
				if(score[y] > score[y+1]) { // 오름차순
					int temp = score[y];
					score[y] = score[y+1];
					score[y+1] = temp;
				}
			}
		}
		
		System.out.print("Data(정렬후) : ");
		for(int x = 0; x < score.length; x++) {
			System.out.print(score[x]+"\t");
		}
		System.out.println();
		
		
		
		
	}
}
