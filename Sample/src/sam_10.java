
public class sam_10 {
	public static void main(String[] args) {
		
		System.out.println("[1 ~ 100������ ¦����,Ȧ������ ����մϴ�.]");
		
		int jjakSum = 0;
		int holSum = 0;
		boolean sw = true;
		
		for(int i = 1; i <= 100; i++) {
			
			if(sw) {
				sw = false;
				holSum+=i;
			}else {
				sw = true;
				jjakSum+=i;
			}
			
		}
		System.out.println("¦���� �� : "+jjakSum);
		System.out.println("Ȧ���� �� : "+holSum);
		
		
	}
}
