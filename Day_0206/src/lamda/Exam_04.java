package lamda;

/*
[���� ���� �����ϴ� ���ٽ� ����]
 */

@FunctionalInterface
interface DDD{
	int test(int x, int y);
}



public class Exam_04 {
	public static void main(String[] args) {
		
		DDD d;
		
		d = (int x, int y) ->{
			int r = x * y;
			return r;
		};
		
		int sum = d.test(10,5);
		
		System.out.println(sum);
		
		d = (x,y) -> {
			int sss = 0;
			for(int i = x; i <= y; i++) {
				sss += i;
			}
			return sss;
		};
		
		System.out.println(d.test(1, 10));
		
		
	}
}
