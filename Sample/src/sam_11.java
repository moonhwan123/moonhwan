
public class sam_11 {
	public static void main(String[] args) {
		
		System.out.println("[1 ~ 100사이의 짝수합,홀수합을 출력합니다.]");
		
		int jjakSum = 0;
		int holSum = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			if(i%2==0) {
				jjakSum+=i;
			}else {	
				holSum+=i;
			}		
		}
		System.out.println("짝수의 합 : "+jjakSum);
		System.out.println("홀수의 합 : "+holSum);
	}
}
