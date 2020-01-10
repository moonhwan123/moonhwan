/*
 1 ~ 10 합계 출력
 출력 : 1 ~ 10 = 55
 */



public class Exam_02 {
	
	public static void main(String[] args) {
		
		sum();
		
		
	}
	
	static void sum() {
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum+=i;
		}
		System.out.println("1 ~ 10 = " + sum);
	}
	
	
}
