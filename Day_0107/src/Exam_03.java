import java.util.Scanner;

/*
키보드 입력 (1~100) 최대 10개 입력 
짝수만 출력
 */

public class Exam_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

/*
		for(int i = 0; i < 10; i++) {
			System.out.print("입력 : ");
			int a = sc.nextInt();
			
			if(a%2 == 0) {
				System.out.println(a);
			}
		}
*/
		
		
		int arr[] = new int[10];
		//입력 작업
		for(int i = 0; i < arr.length; i++) {
			System.out.print("입력 : ");
			int a = sc.nextInt();
			arr[i] = a;
		}
		//출력
		System.out.println("<<입력 자료 >> ");
		for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+"\t");
		}
		//
		System.out.println();
		System.out.println("<<짝수>> ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+"\t");
			}
		}
		
		
		
		
		sc.close();
		
		
	}
}
