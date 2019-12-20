
public class day2 {

	public static void main(String[] args) {
		
		// Swap 알고리즘
		
		int num1 = 10, num2 = 20;
		
		
		System.out.printf("현재 num1에는 : %d\n",num1);
		System.out.printf("현재 num2에는 : %d\n",num2);
		System.out.println();
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.printf("바뀐 값 num1에는 : %d\n",num1);
		System.out.printf("바뀐 값 num2에는 : %d\n",num2);
			
	}

}
