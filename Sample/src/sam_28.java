import java.util.Scanner;

public class sam_28 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[2�� �˻� ���α׷��Դϴ�.]");
		int arr[] = {1,5,10,17,28,43,67,88,92};
		
		System.out.print("ã�� ������ �Է� �ϼ��� >> ");
		int key = sc.nextInt();
		int low = 0;
		int high = arr.length-1;
		int mid;
	
		while(true) {
			if(low <= high) {
				mid = (low + high)/2;
			}else {
				System.out.println(key+"�� ����Ʈ�� ����");
				break;
			}
			if(key == arr[mid]) {
				System.out.println(key+"�� "+(mid+1)+"��°�� �ֽ��ϴ�.");
				break;
			}
			if(key < arr[mid]){
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}

		
		
		
	}
}
