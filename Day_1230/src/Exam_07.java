import java.util.Scanner;

/*
���� 1�� �Է�
'A' ~ 'F' �Ǵ�

 */


public class Exam_07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� �ϼ��� >> ");
		int a = sc.nextInt();
		
		if (a>=90) System.out.println("A");
		else if (a>=80) System.out.println("B");
		else if (a>=70) System.out.println("C");
		else if (a>=60) System.out.println("D");
		else  System.out.println("F");
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
	}

}
