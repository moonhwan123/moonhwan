package lamda;

interface BBB{
	void test(int x);
}

public class Exam_03 {
	public static void main(String[] args) {
		
		BBB b;
		b = (x) -> {
			int result = 100;
			System.out.println(x * result);
		};
		
		b.test(100);
		
		
		
	}
}
