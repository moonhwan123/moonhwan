
public class sam_11 {
	public static void main(String[] args) {
		
		int jjakSum = 0;
		int holSum = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			if(i%2==0) {
				jjakSum+=i;
			}else {	
				holSum+=i;
			}		
		}
		System.out.println("¦���� �� : "+jjakSum);
		System.out.println("Ȧ���� �� : "+holSum);
	}
}
