import java.util.Scanner;

/*
Ű����� ������ ���� data 10�� �Է�
��, data�� 50�̻� 100���ϸ� �Է�
 */


public class Exam_05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		int cnt = 0; //data ���� ī��Ʈ 
		
		
		while(true) {
			System.out.print("������ �Է� �ϼ��� : ");
			int num = sc.nextInt();
			if(num>=50 && num<=100) {
				arr[cnt] = num;
				cnt++;
				if(cnt == 10)break;
			}
		}
		
		for(int j = 0 ; j<arr.length ; j++) {
			System.out.println("arr"+"["+j+"] = "+arr[j]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
