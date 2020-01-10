/*
Java : 90  67  78  80  xx   xx.xx
 */
public class Exam_05 {
	public static void main(String[] args) {
		
		String name = "Java";
		int score[] = {90,67,78,89};
		a(name,score);
		
	}
	
	static void a(String n, int[] arr) {
		System.out.print(n + " : " );
		int sum = 0;
		for(int x = 0; x < arr.length; x++) {
			System.out.print(arr[x] + "\t");
			sum+=arr[x];
		}
		System.out.print(sum+"\t");
		System.out.print(sum/arr.length + "\n");
	}
	
	
	
	
	
}
