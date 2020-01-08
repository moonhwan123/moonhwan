// ¥ﬁ∆ÿ¿Ã
public class Exam_12 {
	public static void main(String[] args) {
		
		int arr[][] = new int[5][5];
		int k = 0;
		int c = 1;
		int i = 0;
		int j = -1;
		int f = arr.length;
		
		while(true) {
			for(int n = 0; n < f; n++) {
				k++;
				j = j + c;
				arr[i][j] = k;
			}
			f = f-1;
			if(f >= 0) {
				for(int n = 0; n < f; n++) {
					k++;
					i = i + c;
					arr[i][j] = k;
				}
				c = c*(-1);
			}else break;
		}
		
		for(int x = 0; x < arr.length; x++) {
			for(int y = 0; y < arr[0].length; y++) {
				if(arr[x][y]==0) {
					System.out.print("");
				}else {
					System.out.print(arr[x][y]+"\t");	
				}
			}
			System.out.println();
		}
		
		
	}
}
