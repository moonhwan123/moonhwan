
public class sam_36 {
	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		int k = 0;
		int c = 1;
		int i = 0;
		int j = -1;
		int f = 5;
		
		do{
			for(int n = 0 ; n < f; n++) {
				k++;
				j+=c;
				arr[i][j] = k;
			}
			f--;
			if(f > 0) {
				for(int n = 0 ; n < f; n++) {
					k++;
					i+=c;
					arr[i][j] = k;
				}
			}
			c*=-1;
		}while(f != 0);
		
		for(int x = 0; x < 5; x++) {
			for(int y = 0; y < 5; y++) {
				if(arr[x][y]==0) {
					System.out.print("\t");
				}else System.out.print(arr[x][y]+"\t");
			}System.out.println();
		}
		
	}
}
