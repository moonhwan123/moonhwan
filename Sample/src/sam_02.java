import java.util.Scanner;

public class sam_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��ϼ��� >>");
		int num_1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ���(ù��° ������ ���� ���� �Է����� ���ÿ�) >>");
		int num_2 = sc.nextInt();
		System.out.println();
		
		int max = 0;
		int min ;
		
		if(num_1 > num_2) {
			max = num_1;
			min = num_2;
		}else {
			max = num_2;
			min = num_1;
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
		
		
	}

}
