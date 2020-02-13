package jslhrd5;

/*
clone이 먹히는 놈들
대표적으로 배열,컬랙션(java.util안에 있는 놈들)
 */

public class Exam_10 {
	public static void main(String[] args) {
		

		int a[] = {10,20,30,40,50};
		int b[] = a; // 주소를 복사한다. 결국 a[] , b[]는 같은 주소를 가리키고 있음
		int c[] = a.clone(); // '값'만 복사가 되고, 주소는 복제가 안됨
	
		b[0] = 77;
		c[1] = 99;
		
		System.out.println("a[] - 원본");
		for(int x = 0 ; x < a.length; x++) {
 			System.out.print(a[x]+"\t");
		}
		System.out.println();
		
		System.out.println("b[] - a[]의 주소복사");
		for(int x = 0 ; x < a.length; x++) {
 			System.out.print(b[x]+"\t");
		}
		System.out.println();
		
		System.out.println("c[] - a[]를 클론");
		for(int x = 0 ; x < a.length; x++) {
 			System.out.print(c[x]+"\t");
		}
		
	}
}
