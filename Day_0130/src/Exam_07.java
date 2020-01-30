/*
[arraycopy 테스트]

 */



public class Exam_07 {
	public static void main(String[] args) {
		
		int[][] var = {{1,2,3},{4,5,6}};
		int[][] arr = new int[3][10];
		
		System.arraycopy(var, 0, arr, 0, var.length); // 값을 복사 해야 하기 때문에 arr배열의 공간을 확보 해야함
		
		for(int x = 0 ; x < arr.length; x++) {
			for(int y = 0 ; y < arr[x].length; y++) {
				System.out.print(arr[x][y]+" ");
			}
			System.out.println();
		}
		
	}
}
