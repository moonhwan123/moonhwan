/*
 1~100 Ȧ����
 1) for��
 2) while��
 */


public class Exam_04 {
	
	public static void main(String[] args) {
		
		//1) for�� ���
		
		//������ ���� �̿�
		int sum = 0;
		
		for(int i = 0; i<=100 ; i++) {
			
			if(i%2 == 1) {
				sum = sum + i;
			}
			
		}
		System.out.println("1~100 ���� Ȧ���� ���� "+sum);
		
		//flag ���(����ġ)
		int sum1 = 0;
		boolean flag = true;
		
		for(int i = 1; i<=100 ; i++) {
			
			if(flag) {
				flag = false;
				sum1 = sum1 + i;
			}else {
				flag = true;
			}
			
		}
		System.out.println("1~100 ���� Ȧ���� ���� "+sum1);
		
		
		
		//flag ���(����ġ) ¦����
		int sum2 = 0;
		boolean flag2 = true;
		
		for(int i = 0; i<=100 ; i++) {
			
			if(flag2) {
				flag2 = false;
				sum2 = sum2 + i;
			}else {
				flag2 = true;
			}
			
		}
		System.out.println("1~100 ���� ¦���� ���� "+sum2);
		
		//������ ���� �̿� ¦����
		int sum3 = 0;
		
		for(int i = 0; i<=100 ; i++) {
			
			if(i%2 == 0) {
				sum3 = sum3 + i;
			}
			
		}
		System.out.println("1~100 ���� ¦���� ���� "+sum3);
		
		
		
		
		//2) while�� ���
		
		
		
		
	} 
	

}
