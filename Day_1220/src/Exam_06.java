import java.util.Scanner;

/*
[���� �ݺ���]
for(){
	for(){
	
	}
}

 */
public class Exam_06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int jul_num = sc.nextInt();
		int kan_num = sc.nextInt();
		
		
		
		for(int i = 1; i <= jul_num; i++) {// �ټ�
			System.out.print(i + " : ");
			for(int j = 1; j <= kan_num ; j++) { // �ٴ� ĭ��
			System.out.print("*");	
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
