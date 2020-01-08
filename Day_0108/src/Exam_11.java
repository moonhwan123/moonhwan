
public class Exam_11 {
	public static void main(String[] args) {
		
		int arr1[][] = new int[5][5];
		
		int k = 1;
		int l = 0;
		int m = arr1.length-1;
		int n = 1;
		
		
		for(int i = 0; i <= arr1.length-1; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j <= m; j++) {
					arr1[i][j] = k;
					k++;
					
				}
			}else {
				for(int j = m; j>=0;j--) {
					arr1[i][j] = k;
					k++;
					
				}
				
				
			}
		}
		for(int x = 0; x < arr1.length; x++) {
			for(int y = 0; y < arr1[0].length; y++) {
				if(arr1[x][y]==0) {
					System.out.print("");
				}else {
					System.out.print(arr1[x][y]+"\t");	
				}
			}
			System.out.println();
		}
		
	
		

		
	}
}
