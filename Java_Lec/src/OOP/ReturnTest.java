package OOP;

public class ReturnTest {
	
	//return값은 오로지 하나만 존재 가능
	static int add(int a, int b) {
		return a+b;
	}
	
	static void add(int a, int b, int[] result) {
		result[0] = a+b;
	}

	public static void main(String[] args) {
		int result = add(3,4);
		System.out.println(result);
		
		int[] result2 = {0};
		
		add(3,5,result2);
		System.out.println(result2[0]);

	}

}
