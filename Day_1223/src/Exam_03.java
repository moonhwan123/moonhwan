import java.util.Scanner;

/*
Ű����� 10���� ������ �Է� �޾Ƽ�
�迭�� ������ ����, ����� ���Ͽ� ����ض�

 */

public class Exam_03 {
	
	public static void main(String[] args) {
		
		//�Է��۾�
		Scanner sc = new Scanner(System.in);
		
		int jumsu[] = new int[10];
		int sum = 0;
		
		
		
		for(int i = 0 ; i<10 ; i++) {
			System.out.print(i+"��° �л��� ������ �Է��ϼ��� : ");
			jumsu[i] = sc.nextInt();
			sum += jumsu[i];
		}
		
		int ave = sum/jumsu.length;
		ave = (int)(ave*10+0.5)/10;
		
		
		int cnt = 0;
		
		//����۾�
		for(int i = 0 ; i<jumsu.length ; i++) {
			System.out.print(i+"��° �л��� ������ "+jumsu[i]+"\t");
			
			cnt ++;
			if(cnt == 5) {
				System.out.println();
				cnt = 0;
			}
		}
		System.out.println();
		System.out.println("===================");
		System.out.println("����\t���");
		System.out.println(sum+"\t"+ave);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
