/*
2���� �迭

 */



public class Exam_08 {
	public static void main(String[] args) {
		
		int[][] score = new int[5][4]; //[row][col] -> [��][��]
		
		System.out.println("row : " + score.length);
		System.out.println("col : " + score[0].length);
		System.out.println("value : " + score[0][0]);
		
		int[] s = {1,2,3,4,5};
		int[][] ss = {{1,2},{3,4,5},{1,2,3,4}}; // 1��° �� 2ĭ , 2��° �� 3ĭ , 3��° �� 4ĭ
		
		for(int x = 0; x < s.length; x++) {
			System.out.print(s[x]+"\t");
		}
		System.out.println();
		
		for(int x = 0; x < ss.length; x++) {
			for(int y = 0; y < ss[x].length; y++) {
				System.out.print(ss[x][y]+"\t");
			}System.out.println();
		}		
		
		
		
		
		
		
		
		
		
	}
}
