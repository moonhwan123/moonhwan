import java.util.Scanner;


public class sosu {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		int tcnt=0;
		int scnt=0;
		int ssum=0;
		
		while(true) {
			System.out.print("2~100 ������ ������ �Է� �ϼ��� >> ");
			number = sc.nextInt();
			
			if(number == -99) break;
			
			if(number >=2 && number<=100) {
				tcnt++;
				for(int i = 2; i<=number; i++) {
					if(number%i==0) {
						if(number==i) {
							scnt++;
							ssum+=number;
						}
						else break;
					}
					
				}
			}
			else System.out.println("�Է¿���");
		}
		
		System.out.println("�Է� ���� : "+tcnt);
		System.out.println("�Ҽ� ���� : "+scnt);
		System.out.println("�Ҽ� �� : "+ssum);
		
	}

}
