
public class sam_37 {
	public static void main(String[] args) {
		
		int arr[][] = new int[5][5];
		int k = 0;
		
		for(int i = 0; i < 5; i++) {
			arr[i][4] = 0;
			for(int j = 0; j < 4; j++) {
				k++;
				arr[i][j] = k;
				arr[i][4] += arr[i][j];
			}
		}
		
		for(int x = 0; x < 5; x++) {
			for(int y = 0; y < 5; y++) {
				if(arr[x][y]==0) {
					System.out.print("\t");
				}else System.out.print(arr[x][y]+"\t");
			}System.out.println();
		}
		
	}
}
