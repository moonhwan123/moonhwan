
public class sam_27 {
	public static void main(String[] args) {
		
		int score[] = {30,50,80,10,90};
		int rank[] = new int[5];
		
		for(int i = 0; i < score.length; i++) {
			rank[i] = 1;
		}
		
		for(int i = 0; i<score.length; i++) {
			for(int j = 0; j<score.length; j++) {
				if(score[i]<score[j]) {
					rank[i] += 1;
				}
			}
		}
		
		for(int i = 0; i < score.length; i++) {
			System.out.print(score[i]+"점"+"\t");
		}
		System.out.println();
		for(int i = 0; i < score.length; i++) {
			System.out.print(rank[i]+"등"+"\t");
		}
		
	}
}
