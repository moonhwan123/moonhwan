import java.util.Scanner;

/*
Ű���� �Է� (2~100)
�Է°��� -99�̸� ����
�Է��ڷ� �� �Ҽ��� ���Ͽ� ���(�ִ� 5��)

�Է� : 5
...
�Է� : -99
�Ҽ� : XX	XX XX XX
 */

public class Exam_04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int sosu[] = new int[5];
		int pcnt = 0;
		
		while(true) {
			System.out.print("�Է� : ");
			num = sc.nextInt();
			
			if(num == -99||pcnt == 5) break;
			
			if(num>=2 && num<=100) {
				for(int i = 2; i <= num; i++) {
					if(num%i == 0) {
						if(num==i) {
							sosu[pcnt] = num;
							pcnt++;
						}else break; 
					}
				}

			}else System.out.println("�߸��� �Է°�");
			
		}
		System.out.println("<�Ҽ�����Ʈ>");
		for(int j = 0; j < pcnt; j++) {
			System.out.print(sosu[j]+"\t");
		}
		
		
	}
}
