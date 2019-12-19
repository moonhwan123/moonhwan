import java.util.Scanner;

/*
키보드 입력
번호:
국어:
영어:
수학:

출력
번호	국어 	영어	수학	총점	평균

처리조건
총점 = 국어+영어+수학
평균 = 총점/3.
3과목 모두 40점 이상이고,평균 60점 이상
1과목이라도 40미만이면 '과락'
3과목 모두 40이상이지만 평균이 60미만이면 '불합격'
 */


public class Exam_07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("번호을 입력 하세요 : ");
		int num = sc.nextInt();
		
		System.out.print("국어점수를 입력 하세요 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어점수를 입력 하세요 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학점수를 입력 하세요 : ");
		int mat = sc.nextInt();
		
		int tot = kor + eng + mat;
		double ave = tot/3.;
		ave = (int)(ave*10-0.5)/10.;
		
		String str ="";
		
		
		if(ave >= 60) {
			if(kor >= 40 && eng >= 40 && mat>= 40) {
				str = "PASS";
			}else str = "과락";
		}else str = "NOT PASS";
		
		
		/*
		if(kor>=40 && eng>=40 && mat>=40 && ave>= 60) {
			str = "PASS";
		}
		else {
			if(ave<60) { 
				str = "NOT PASS";
			}
			else str = "과락";
		}
		*/
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t판정");
		System.out.println(num+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+ave+"\t"+str);
		
		sc.close();
	}

}
