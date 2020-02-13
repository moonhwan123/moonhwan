/*

두개의 정수 입력하여 대/소 구분
단, 동일한 값은 없음




 */


public class Exam_09 {
	
	public static void main(String[] args) {
		
		int a = 90, b = 80;
		int big,small;
		
		if(a>b) {
			big = a;
			small = b;
		}else{
			big = b;
			small = a;
		}
		
		System.out.println("big = "+big+", small = "+small);
		
	}

}
