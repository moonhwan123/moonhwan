
public class sam_30 {
	public static void main(String[] args) {
		
		int arr[][] = new int[5][5];
		int k = 1;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				arr[j][i] = k;
				k++;
			}
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(arr[i][j]+"\t");
			}System.out.println();
		}

		
		
		
		
	}
}
