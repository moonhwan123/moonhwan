
public class sam_39 {
	public static void main(String[] args) {
		
		int arr[][] = {{13,24,23,15,2},{23,45,13,76,1},{23,34,63,45,3}
		,{21,43,76,34,4},{56,74,26,25,5}};
		
		System.out.println("[정렬 전]");
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+"\t");
			}System.out.println();
		}
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i][4]>arr[j][4]) {
					for(int k = 0; k < arr[0].length; k++) {
						int temp = arr[i][k];
						arr[i][k] = arr[j][k];
						arr[j][k] = temp;
					}
				}
			}
		}
		
		System.out.println("[정렬 후]");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+"\t");
			}System.out.println();
		}
		
	}
}
