import java.util.Scanner;

public class Exam_04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호 입력 : ");
		int bun = sc.nextInt();
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		System.out.print("국어 점수 : ");
		double kor = sc.nextDouble();
		
		System.out.print("영어 점수 : ");
		double eng = sc.nextDouble();
		
		System.out.print("수학 점수 : ");
		double mat = sc.nextDouble();
		
		double tot = kor + eng + mat;
		
		double ave = tot/3;
		
		System.out.println();
		
		System.out.println("[성적표]");
		System.out.println("번호\t이름\t총점\t평균");
		System.out.println(bun+"\t"+name+"\t"+tot+"\t"+ave);
		
		
		
	}

}
