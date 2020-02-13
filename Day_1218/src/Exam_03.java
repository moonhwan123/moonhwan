import java.util.Scanner;

/*
번호, 이름, 국어, 영어, 수학점수를 키보드로 입력
총점, 평균(소수이하 두번째 자리에서 반올림)
 */


public class Exam_03 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호를 입력하세요 : ");
		int number = sc.nextInt();
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수를 입력 하세요 : ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		
		double ave = (double)total/3; 
		ave = (int)(ave*10+0.5)/10.; 
		
		System.out.println("번호는 : "+number);
		System.out.println("이름은 : "+name);
		System.out.println("총점은 : "+total);
		System.out.println("평균은 : "+ave);
		
		sc.close();
		
	}

}
