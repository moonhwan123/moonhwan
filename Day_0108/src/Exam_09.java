
public class Exam_09 {
	public static void main(String[] args) {
		
		int[][] a = new int[5][5];
		
		int k = 1;
		//입력
		for(int x = 0; x < a.length; x++) {
			for(int y = x; y < a[0].length; y++) {
				a[x][y] = k;
				k++;
			}
		}
		//출력
		for(int x = 0; x < a.length; x++) {
			for(int y = 0; y < a[0].length; y++) {	
				System.out.print(a[x][y]+"\t");				
			}
			System.out.println();
		}

		
/*		
		for(int x = 0; x < a.length; x++) {
			for(int y = 0; y < a[0].length; y++) {
				if(a[x][y] != 0) {
					System.out.print(a[x][y]+"\t");
				}
			}
			System.out.println();
		}
*/
		
/*		
		for(int x = 0; x < a.length; x++) {
			for(int y = 0; y < a[0].length; y++) {
				if(a[x][y] == 0) {
					System.out.print("\t");
				}else
					System.out.print(a[x][y]+"\t");
				
			}
			System.out.println();
		}
*/		
		
		
		
	}
}
