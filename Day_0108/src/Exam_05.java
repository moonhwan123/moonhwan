
public class Exam_05 {
	public static void main(String[] args) {
		
		int[] score = {50,70,60,90,80};
		System.out.print("Data(정렬전) : ");
		for(int x = 0; x < score.length; x++) {
			System.out.print(score[x]+"\t");
		}
		System.out.println();
		
		//선택정렬 작업 (앞에서부터 값이 고정되면서 바뀜)
		for(int x = 0 ; x < score.length-1; x++) { //기준값의 변화
			for(int y = x+1 ; y < score.length; y++) { //비교값의 변화
				if(score[x] > score[y]) { // 오름차순
					int temp = score[x];
					score[x] = score[y];
					score[y] = temp;
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
