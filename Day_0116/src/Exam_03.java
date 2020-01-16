/*
[상수 정의]
리터럴(10,'a',3.13, "aa")
final 사용

상수 만드는 keyword -> final
 */

class AA{
	final double PI = 3.14;
	final static int MAX = 100; // 대문자 사용
}
public class Exam_03 {
	public static void main(String[] args) {
		
		AA a = new AA();
		int b = 3;
//		a.PI = 314; final이라 못바꿈
		double d = b*a.PI;
	}
}
