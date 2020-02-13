import java.util.Scanner;

/*
입력된 정수의 값이 70 ~ 90 일때 합격
그렇지 않으면 암것도 안함

 */
public class Exam_06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		/*
		System.out.print("점수를 입력 하세요 : ");
		int jumsu = sc.nextInt();
		
		if(jumsu >= 70) {
			if(jumsu <= 90) System.out.println("합격");
		}
		*/

		
		
		/*
		System.out.print("점수를 입력 하세요 : ");
		int jumsu = sc.nextInt();
		
		if(jumsu >= 70) {
			if(jumsu <= 90) System.out.println("합격");
			else System.out.println("응 불합격");
		}
		else System.out.println("응 불합격");
		*/
		
		System.out.print("점수를 입력 하세요 : ");
		int jumsu = sc.nextInt();
		
		if(jumsu >= 70 && jumsu <= 90) {
			System.out.println("합격");
		}
		else System.out.println("불합격");
		
		
		
		
		sc.close();
	}

}
