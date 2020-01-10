import java.util.Scanner;

public class sam_21 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		
		
	}
}
