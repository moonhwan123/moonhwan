import java.util.Scanner;

/*
Ű���� �Է� (1~100) �ִ� 10�� �Է� 
¦���� ���
 */

public class Exam_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

/*
		for(int i = 0; i < 10; i++) {
			System.out.print("�Է� : ");
			int a = sc.nextInt();
			
			if(a%2 == 0) {
				System.out.println(a);
			}
		}
*/
		
		
		int arr[] = new int[10];
		//�Է� �۾�
		for(int i = 0; i < arr.length; i++) {
			System.out.print("�Է� : ");
			int a = sc.nextInt();
			arr[i] = a;
		}
		//���
		System.out.println("<<�Է� �ڷ� >> ");
		for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+"\t");
		}
		//
		System.out.println();
		System.out.println("<<¦��>> ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+"\t");
			}
		}
		
		
		
		
		sc.close();
		
		
	}
}
