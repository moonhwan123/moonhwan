/*
[메소드 호출 방식]
1. 값에 의한 호출


 */
public class Exam_06 {
	public static void main(String[] args) {
		
		System.out.println("--------교환전---------");
		int a = 10, b = 20;
		System.out.println("a = "+a);
		System.out.println("b = "+b);

		// a, b 교환 
		System.out.println("--------교환후---------");
		swap(a,b); // 왜 안바뀌지? ->  값에 의한 호출이다 이건, a와b 통째로 넘어 가는게 아니고
		           //              a의값,b의값이 넘어 간다

		
/*		
		int c = a;
		a = b;
		b = c;
*/
		System.out.println("a = "+a);
		System.out.println("b = "+b);		

	}
	
	static void swap(int x,int y) { // 값에의한 호출
		int c = x;
		x = y;
		y = c;
	}
	

}
