import java.util.Scanner;

public class sam_22 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int[] arr = new int[10];
		
		for(int x = 0; x < arr.length; x++) {
			System.out.print(x+"��° �迭�� ������ �� �Է� : ");
			int num = sc.nextInt();
			arr[x] = num;
		}
		
		int i = 0;
		while(i != 10) {
			System.out.print(arr[i]+"\t");
			i++;
		}
		
		
		
		
	}
}
