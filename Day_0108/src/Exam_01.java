import java.util.Scanner;

/*
Ű���� �Է� (1 ~ 10) -> 7�� �Է�
�Է� : 5
�Է� : 0
�Է� ���� 
�Է� : 9
.....
-> 7�� �Է½� ��� 
[���]
�Է� �ڷ� : 5 9 x x x x x
�ִ밪 : 
�ּҰ� : 
�հ�(�ִ�, �ּҸ� �� �հ�) : 

 */

public class Exam_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[7];
		int cnt = 0;

		//�Է�
		while(cnt<7) {
			System.out.print("�Է� : ");
			int num = sc.nextInt();
			if(num >= 1 && num <= 10) {
				arr[cnt] = num;
				cnt++;
			}else System.out.println("�Է� ����");
		}
		//�ִ�,�ּ�,�հ�
		int max = arr[0]; // int max = -999
		int min = arr[0]; // int min = 999
		int sum = arr[0]; // int sum = 0; // üũ�ʿ�
		
		for(int x = 1; x < arr.length; x++) {
			if(max<arr[x]) {
				max = arr[x];
			}
			if(min>arr[x]) { // else if �ϸ� �ȵ� (�����Ȱ�)
				min = arr[x];
			}
			sum+=arr[x];
		}
		
		//�Է��ڷ� ���
		System.out.print("�Է� �ڷ� : ");
		for(int i = 0; i <= arr.length-1; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		System.out.println("�ִ�,�ּҸ� �� �հ� : " + (sum-max-min));
		
		
		
		
		
		
		
	}
}
