import java.util.Scanner;

/*
[�Ҽ� �Ǻ� �ϱ�]
Ű���� �Է� 
1) -99�� �Է½� ���α׷� ����
2) �Է� ������ 2 ~ 100 
2) �Է� �ڷ��� �Ҽ��� ������ ���� ���Ͽ� ���

�Է� : -6 --> �Է� �ڷ� �ƴ�
�Է� ���� 
�Է� : 3,7,15,67,45,38,-99
...
�Է� : -99 --> �Է� �ڷ� �ƴ�
�Է� �ڷ� �� : xx
�Ҽ� ���� : xx
�Ҽ� �հ� : xx

 */
public class Exam_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tcnt=0;
		int pcnt=0;
		int psum=0;
		
		while(true) {
			System.out.print("������ �Է� �ϼ��� (2~100) >> ");
			int num = sc.nextInt();
			
			// �Է� ���� üũ
			if(num == -99) {
				break;
			}
			
			if(num>=2 && num<=100) {
				tcnt++;
				for(int i = 2; i <= num; i++) {
					
					if(num%i ==0) {
						if(num==i) {
							pcnt++;
							psum+=num;
							break; // for�� Ż��
						}
						else {// ���⼭ else�� ���� �Ⱦ��� ũ�� ���� ����
							break; // for�� Ż��
						}
					}
				}

			}else System.out.println("�Է� ����");

		}
		
		System.out.println("�� �Է� �ڷ� �� : "+tcnt);
		System.out.println("�Ҽ� ���� : "+pcnt);
		System.out.println("�Ҽ� �� : "+psum);
		

	}

}
