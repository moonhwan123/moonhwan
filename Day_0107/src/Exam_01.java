/*
int[] a = new int[10];
일때
a -> 첫 번째 요소의 주소값 (실제값 X)
a[0] -> 값 그자체
a.length -> 배열의 길이 (이경우엔 10)
 */
public class Exam_01 {
	
	public static void main(String[] args) {
		
		int[] score; // 배열 선언
		score = new int[10]; // 실제 할당(메모리 공간 확보) , 자동 초기화(기본값으로)
		score[0] = 10;
		score[1] = 20;
//		score[10] = 100; // 런타임에러 발생
		
		System.out.println(score);
		System.out.println(score[0]);
		System.out.println(score.length);
		
		
		
		
		
		
		
		
	}

}
