/*
[메소드 호출 방식]
2. 참조에 의한 호출
 */
public class Exam_07 {
	public static void main(String[] args) {
		
		int a[] = {10,20};
		
		System.out.println("-------------교환 전--------------");
		System.out.println("a[0] = " + a[0]);
		System.out.println("a[1] = " + a[1]);
/*		
		int c = a[0];
		a[0] = a[1];
		a[1] = c;
*/		
		swap(a);
		System.out.println("-------------교환 후--------------");
		System.out.println("a[0] = " + a[0]);
		System.out.println("a[1] = " + a[1]);
		
	}
	
	static void swap(int[] arr) { // 참조에 의한 호출
		int c = arr[0];
		arr[0] = arr[1];
		arr[1] = c;
	}
	
}
