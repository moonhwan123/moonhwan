import java.util.Scanner;

/*
������ ������ Ű����� �Է� -> ��,��,�� ���
��, ������ ���� ����.
 */


public class Exam_10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 3���� �Է��ϼ��� >> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int MAX,MID,MIN;
		
		if(num1 > num2) {
			if(num1 > num3) {
				MAX = num1;
				if(num2 > num3) {
					MID = num2;
					MIN = num3;
				}else {
					MID = num3;
					MIN = num2;
				}
			}else {
				MAX = num3;
				MID = num1;
				MIN = num2;
			}
		}else if (num2 > num3) {
			MAX = num2;
			if(num1 > num3) {
				MID = num1;
				MIN = num3;
			}else {
				MID = num3;
				MIN = num1;
			}
		}else {
			MAX = num3;
			MID = num2;
			MIN = num1;
		}
		
		System.out.println("MAX = "+MAX+", MID = "+MID+", MIN = "+MIN);
		
		sc.close();
		
		
	}

}
