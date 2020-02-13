import java.util.Scanner;

public class sam_22 {
	public static void main(String[] args) {
		System.out.println("[배열의 0번지~10번지 사이에 값을 입력 해주세요]");
		Scanner sc = new Scanner(System.in);
	
		int[] arr = new int[10];
		
		for(int x = 0; x < arr.length; x++) {
			System.out.print(x+"번째 배열에 저장할 수 입력 : ");
			int num = sc.nextInt();
			arr[x] = num;
		}
		System.out.println("[배열에 저장된 수는 아래와 같습니다.]");
		int i = 0;
		while(i != 10) {
			System.out.print(arr[i]+"  ");
			i++;
		}
		
		
		
		
	}
}
