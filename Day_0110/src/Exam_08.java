import java.util.Scanner;

/*
[����Ÿ�԰� �Ű������� �ִ� ���]

Ű����� ���� �Է�
�Էµ� ���� ���� �հ� ���

 */
public class Exam_08 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		
		int num = sc.nextInt();
		int ss = intSum(num);
		System.out.println(ss);
	}
	
	static int intSum(int a) { // �迭�� ���� ���� �ʿ����. why? ���� �Ѿ� ���°� �ƴϱ� ����
		int sum = 0;
		
		for(int x = 1; x <= a; x++) {
			sum+=x;
		}

		return sum;
	}
	//���� �޼ҵ��� ��������� �����ΰ��� �ؾ� �� ���� ���ϰ��� �ʿ��ϴ�.

}
