/*
 1~100 ¦����
 */
public class Exam_05 {
	
	public static void main(String[] args) {
		
		//2�� ���� �����ֱ�
		int i = 0, eventot = 0;
		while(true) {
			i = i + 2;
			eventot = eventot + i ;
			if(i == 100) {
				break;
			}
		}
		System.out.println("1~100 ���� ¦�� ���� "+eventot);
		
		//���ǹ��߰�
		i = 0;
		int eventot1 = 0;
		while(i<100) {
			i = i + 2;
			eventot1 = eventot1 + i ;
			
		}
		System.out.println("1~100 ���� ¦�� ���� "+eventot1);
		
		//������ ���� �̿�
		i = 0;
		int eventot2 = 0;
		while(i<100) {
			
			i = i + 2;
			if(i % 2 ==0) {
				eventot2 = eventot2 + i ;
			}
			
		}
		System.out.println("1~100 ���� ¦�� ���� "+eventot2);
		
		//flag�̿�
		i = 0;
		int eventot3 = 0;
		boolean flag = true;
		while(i<100) {
			i++;
			if(flag) {
				flag = false;
			}else {
				eventot3 += i;
				flag = true;
			}
		}
		System.out.println("1~100 ���� ¦�� ���� "+eventot3);
		
		
		
		
		
		
	}

}
