
class AA{
	int a;
	int b;
	
}

public class Exam_05 {
	public static void main(String[] args) {
		
		AA a = new AA();
		
		AA[] s = new AA[5]; // 클래스 배열
//		s[0] = 10; -> 오류
		
		s[0] = new AA();
		s[0].a = 100;
		
		s[1] = new AA();
		s[1].a = 200;
		System.out.println("s[0] = "+s[0]);
		System.out.println("s[1] = "+s[1]);
		System.out.println("s[0].a = "+s[0].a);
		System.out.println("s[1].a = "+s[1].a);
	}
}
