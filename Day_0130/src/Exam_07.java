/*
[arraycopy �׽�Ʈ]

 */



public class Exam_07 {
	public static void main(String[] args) {
		
		int[][] var = {{1,2,3},{4,5,6}};
		int[][] arr = new int[3][10];
		
		System.arraycopy(var, 0, arr, 0, var.length); // ���� ���� �ؾ� �ϱ� ������ arr�迭�� ������ Ȯ�� �ؾ���
		
		for(int x = 0 ; x < arr.length; x++) {
			for(int y = 0 ; y < arr[x].length; y++) {
				System.out.print(arr[x][y]+" ");
			}
			System.out.println();
		}
		
	}
}
