import java.util.Scanner;

/*
번호, 이름 , 국어점수 , 영어점수 , 수학점수를
입력받아서 총점, 평균을 계산 하여 출력
 */

public class Exam_08 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호를 입력하세요 : ");
		int s_num = sc.nextInt(); 
		System.out.print("이름을 입력하세요 : ");
		String s_name = sc.next(); 
		System.out.print("국어점수를 입력하세요 : ");
		int kor_score = sc.nextInt(); 
		System.out.print("영어점수를 입력하세요 : ");
		int eng_score = sc.nextInt(); 
		System.out.print("수학점수를 입력하세요 : ");
		int math_score = sc.nextInt(); System.out.println("=====================");
		
		int total_score = kor_score + eng_score + math_score;
		double average_score = total_score /3. ;
		
		
		System.out.println("번호\t이름\t총점\t평균");
		System.out.println(s_num+"\t"+s_name+"\t"+total_score+"\t"+average_score+"\t");
		
		
		sc.close();
	}
}
