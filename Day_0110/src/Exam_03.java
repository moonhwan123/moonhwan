/*
 1 ~ a 합계 출력
 출력 : 1 ~ a = xx
 
리턴타입은 없고 매개변수는 있는 경우
매개변수는 몇개가 와도 상관없음
그리고 모든 자료형이 올 수 있음
 */



public class Exam_03 {
	
	public static void main(String[] args) {
		
		sum(100);
		
		
	}
	
	//리턴타입은 없고 매개변수는 있는 경우
	static void sum(int a) {
		int sum = 0;
		
		for(int i = 1; i <= a; i++) {
			sum+=i;
		}
		System.out.println("1 ~ "+ a +" = " + sum);
	}
	
	
}
