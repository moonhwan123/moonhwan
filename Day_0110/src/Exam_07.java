/*
[�޼ҵ� ȣ�� ���]
2. ������ ���� ȣ��
 */
public class Exam_07 {
	public static void main(String[] args) {
		
		int a[] = {10,20};
		
		System.out.println("-------------��ȯ ��--------------");
		System.out.println("a[0] = " + a[0]);
		System.out.println("a[1] = " + a[1]);
/*		
		int c = a[0];
		a[0] = a[1];
		a[1] = c;
*/		
		swap(a);
		System.out.println("-------------��ȯ ��--------------");
		System.out.println("a[0] = " + a[0]);
		System.out.println("a[1] = " + a[1]);
		
	}
	
	static void swap(int[] arr) { // ������ ���� ȣ��
		int c = arr[0];
		arr[0] = arr[1];
		arr[1] = c;
	}
	
}
