
public class sam_38 {
	public static void main(String[] args) {
		
		int arr[][] = new int[5][5];
		int k = 0;
		
		for(int i = 0; i < 4; i++) {
			arr[i][4] = 0;
			arr[4][i] = 0;
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				k++;
				arr[i][j] = k;
				arr[i][4] += arr[i][j];
				arr[4][j] += arr[i][j];
				arr[4][4] += arr[i][j];
			}
			
		}
		
		
		
		for(int x = 0; x < 5; x++) {
			for(int y = 0; y < 5; y++) {
				 System.out.print(arr[x][y]+"\t");
			}System.out.println();
		}
		
	}
}
