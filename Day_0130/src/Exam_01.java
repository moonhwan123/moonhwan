import java.util.Scanner;
import java.util.regex.Pattern;

/*
[����ǥ����] - PatternŬ���� 
������ ��ȿ�� �˻�� ���� ���
\\d - ���� 1���� , \\w - ���� �Ǵ� ����
\\d? - ���ڰ� ���� �Ǵ� 1�� , \\d* - 1�� �̻� ,
\\d{3} - ���� 3�� , \\d{1,3} -> 1���̻� 3�� �̳� ,

Ű����� ������ �Է� 1�� �̻� 

 */

public class Exam_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		String[] var = sc.nextLine().split(",");
		
		for(int x = 0; x < var.length; x++) {
			boolean bool = Pattern.matches("\\w*", var[x]); // �����̸� true, �ƴϸ� false
															// ���� Ŭ������ ����ƽ �޼��� �̱⶧���� Ŭ���������� ���� ȣ���Ѵ�.
															// ����Ÿ���� boolean�̴�.
			if(bool) {
				System.out.println(var[x]+"�� ����");
			}else {
				System.out.println(var[x]+"�� ����");
			}
		}
		
		
		
	}
}
