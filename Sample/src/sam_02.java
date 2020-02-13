import java.util.Scanner;

public class sam_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 >>");
		int num_1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요(첫번째 정수와 같은 값은 입력하지 마시오) >>");
		int num_2 = sc.nextInt();
		System.out.println();
		
		int max = 0;
		int min ;
		
		if(num_1 > num_2) {
			max = num_1;
			min = num_2;
		}else {
			max = num_2;
			min = num_1;
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
		
		
	}

}
