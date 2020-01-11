import java.util.Scanner;

public class sam_21 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int i = 0;
		
		while(i != 10) {
			System.out.print(i+"번째 배열에 저장할 수 입력 : ");
			int num = sc.nextInt();
			arr[i] = num;
			i++;
		}
		
		for(int x = 0; x < arr.length; x++) {
			System.out.print(arr[x]+"\t");
		}
		
		
		
	}
}
