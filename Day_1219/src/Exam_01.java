
public class Exam_01 {
	
	public static void main(String[] args) {
		
		int a = 5, b;
		
		b = a++ + 5;
		
		System.out.println("a = "+a+", b = "+b); // 11되는거 아님
		
		
		int c = ++a + 5;
		
		System.out.println("a = "+a+", c = "+c);
		
		
	}

}
