/*
 1)
 1	6	11	16	21
 2	7	12	17	22
 3	8	13	18	23
 4	9	14	19	24	
 5	10	15	20	25
 
 2)
 1
 2	3
 4	5	6
 7	8	9	10
 11	12	13	14	15
 
 3)
 				1
 			2	3
 		4	5	6
 	7	8	9	10
11	12	13	14	15
 
 4)
1
3	2
6	5	4
10	9	8	7	
15	14	13	12	11
 
 */

public class Exam_10 {
	public static void main(String[] args) {
		//1)
		System.out.println("1)");
		int arr1[][] = new int[5][5];
		
		int k1 = 1;
		//입력
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[0].length; j++) {
				arr1[j][i] = k1;
				k1++;
			}
		}
		//출력
		for(int x = 0; x < arr1.length; x++) {
			for(int y = 0; y < arr1[0].length; y++) {	
				System.out.print(arr1[x][y]+"\t");				
			}
			System.out.println();
		}
		
		//2)
		System.out.println("2)");
		int arr2[][] = new int[5][5];
		int k2 = 1;
		//입력
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < i+1; j++) { //j <= i 도 같음
				arr2[i][j] = k2;
				k2++;
			}
		}

		//출력
		for(int x = 0; x < arr2.length; x++) {
			for(int y = 0; y < arr2[0].length; y++) {
				if(arr2[x][y]==0) {
					System.out.print("\t");
				}else {
					System.out.print(arr2[x][y]+"\t");	
				}
			}
			System.out.println();
		}
		
		//3)
		System.out.println("3)");
		int[][] arr3 = new int[5][5];
		int k3 = 0;
		//입력
		for(int i = 0; i < arr3.length; i++) {
			for(int j = arr3.length-1-i; j < arr3.length; j++) {
				k3++;
				arr3[i][j] = k3;
			}
		}
		//출력
		for(int x = 0; x < arr3.length; x++) {
			for(int y = 0; y < arr3[0].length; y++) {
				if(arr3[x][y]==0) {
					System.out.print("\t");
				}else {
					System.out.print(arr3[x][y]+"\t");	
				}
			}
			System.out.println();
		}
		
		//4)
		System.out.println("4)");
		int arr4[][] = new int[5][5];
		int k4 = 1;
		//입력
		for(int i = 0; i < arr4.length; i++) {
			for(int j = i; j >= 0; j--) {
				arr4[i][j] = k4;
				k4++;
			}
		}

		//출력
		for(int x = 0; x < arr4.length; x++) {
			for(int y = 0; y < arr4[0].length; y++) {
				if(arr4[x][y]==0) {
					System.out.print("\t");
				}else {
					System.out.print(arr4[x][y]+"\t");	
				}
			}
			System.out.println();
		}
		
		
		
	}
}
