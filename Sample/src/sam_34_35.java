
public class sam_34_35 {
	public static void main(String[] args) {
		
		int arr[][] = new int[5][5];
		int k = 0;
		
		int l = 1;
		int m = 5;
		int n = 1;
		
		for(int i = 0; i < arr.length; i++) {
			if(i%2 == 0) {
				for(int j = 0; j < arr.length; j++) {
					k++;
					arr[i][j] = k;
				}
			}else {
				for(int j = arr.length-1; j >= 0 ; j--) {
					k++;
					arr[i][j] = k;
				}
			}
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(arr[i][j]==0) {
					System.out.print("\t");
				}else System.out.print(arr[i][j]+"\t");
			}System.out.println();
		}
		
	
		
	}
}
