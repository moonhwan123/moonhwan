import java.util.Scanner;

/*
Ű���� �Է�(1~99)
�Է� �ڷᰡ -99, �Ǵ� �Է��ڷ� �Ǽ��� 20 �̸� ����
�Է� : 77
...
�Է� : -99 (-99�� �Է��ڷ� �ƴ�)
�Է��ڷ� : 77 xx xx xx ....
��� : xxx
��տ� ���� ����� �� : xx (������ ���� ������ ,ū�� - ������)

 */
public class Exam_08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[20];
		int cnt = 0;
		int ave = 0;
		int sum = 0;
		
		while(true) {
			System.out.print("�Է�(1~99) : ");
			int num = sc.nextInt();
			
			if(num == -99 || cnt == 20) break;
			if(num >= 1 && num <= 99) {
				arr[cnt] = num;
				cnt++;
				sum+=num;
			}else System.out.println("�Է� ����");
		}

		ave = sum/cnt;
		
		int cha[] = new int[cnt];	
		
		for(int x = 0; x < cnt; x++) {
			if(ave < arr[x]) {
				cha[x] = arr[x] - ave;
			}else { 
				cha[x] = ave - arr[x];
			}
		}
		
		int min = cha[0];
		int d=0;
		for(int x = 1; x < cnt; x++) {
			if(min>cha[x]) {
				min = cha[x];
				d = x;
			}
			
		}

		System.out.print("�Է� �ڷ� : ");
		for(int x = 0; x < cnt; x++) {
			System.out.print(arr[x]+"\t");
		}
		
		System.out.println();
		System.out.print("��� : "+ ave+"\n");
		System.out.println("��տ� ���� ������ : " + arr[d]);
		
		
		
		
		
	}

}
