/*
1~10 ���� �հ� 
1+2+3+4+ ..... + 10 = 55




 */
public class Exam_05 {
	public static void main(String[] args) {
		
		int i = 0;
		int s = 0;
		
		/*
		do {
			i++;
			s+=i;
		}while(i<10);
		
		System.out.println("1���� 10������ �� "+s);
		*/
		
		/*
		while(i<10) {
			i++;
			s+=i;
		}
		System.out.println("1���� 10������ �� "+s);
		*/
		
		while(true) {
			i++;
			s+=i;
			if(i==10) {
				break;
			}
		}
		System.out.println("1���� 10������ �� "+s);
		
		
		
		
		
		
		
		
	}

}
