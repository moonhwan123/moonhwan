import java.util.Scanner;

/*
Ű���� �Է�(10��)
���� ���� ���� ���
1. ��, ����� main()����

Source Data :  ------
Sort Data : ------

2. ���� ���� ������ �޼ҵ� �̿�
 */
public class Exam_09 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int source[] = new int[10];
		
		//�迭 �Է�	
		System.out.print("�迭 �Է� : ");
		for(int x = 0; x < 10; x++) {
			source[x] = sc.nextInt();
		}
		
		//Source Data
		printData("Source",source);
		//���ĸ޼ҵ� ȣ��
		arrSort(source);
		//������ ���
		printData("Sort",source);
		
		
	}
	//�������� �޼���
	static void arrSort(int arr[]) {
		for(int x = 0; x < arr.length-1; x++) {
			for(int  y = x+1; y < arr.length; y++) {
				if(arr[x]>arr[y]) {
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}//�ι�° for�� ��
		}//ù��° for�� ��
	}//�޼ҵ� ��
	
	//�迭 ��� �޼���
	static void printData(String str,int[] arr) {
		System.out.println("["+str+"Data]");
		for(int x = 0; x < arr.length; x++) {
			System.out.print(arr[x]+"\t");
		}
		System.out.println();
	}
	
	
}
