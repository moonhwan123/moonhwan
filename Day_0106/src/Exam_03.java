import java.util.Scanner;

/*

 */
public class Exam_03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� >> ");
		int money = sc.nextInt();
		int m = 50000; // ȭ�����
		boolean sw = true;
		
		
		for(int x = 1; x <= 10; x++) {
			int s = money / m ;
			System.out.println(m+" : "+s);
			if(sw) {
				money = money-(s*m); // money = money % m; (������ �����ڰ� ������)
				m = m/5;
				sw = false;
			}else {
				money = money-(s*m);
				m = m/2;
				sw = true;
			}
		}
		
		
		
		
		
		
		
		
		

		
		
		
	}

}
