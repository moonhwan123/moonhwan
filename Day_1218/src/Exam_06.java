/*
[논리연산자] 
!(not,단항연산자) -> &&(and) -> ||(or)
 */


public class Exam_06 {
	
	public static void main(String[] args) {
		
		System.out.println("5>4 && 7<8 = " + (5>4 && 7<8));
		System.out.println("5>4 || 7<8 = " + (5>4 || 7<8));
		
		System.out.println("!5>4 = " + !(5>4));
		
		boolean flag = false;
		System.out.println("!flag = " + !flag);
		
		int a = 100;
		System.out.println("a = " + a);
		//System.out.println("!a = " = !a); // 오류
		
		int sw = 0;
		System.out.println("sw==0 " + (sw==0));
		System.out.println("sw!=0 " + (sw!=0));
		System.out.println("sw==1 " + (sw==1));
		// 위 방법은 불편 -> 논리형 사용시 편리
		
		
		
	}

}
