import java.util.Scanner;

public class sam_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("점수 입력 : ");
			int num = sc.nextInt();
			if(num>100) {
				System.out.println("입력 오류!");
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			switch(num/10) {
			case 10:
			System.out.println("수");
			break;
			case 9:
			System.out.println("수");
			break;
			case 8:
			System.out.println("우");
			break;
			case 7:
			System.out.println("우");
			break;
			case 6:
			System.out.println("양");
			break;
			default:
				System.out.println("가");
			}
		
		}
		
		
	}

}
