import java.util.Scanner;

/*

if(조건식){ // 참
	문장1;
}else{ // 거짓
	문장2
}
  문장3;


문제 : 키보드로 점수를 입력 받아서 85점 이상 이면 '합격'
           아니면 '불합격'

 */


public class Exam_04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int jumsu = sc.nextInt();
		
		String str = "";
		
		if (jumsu >= 85) {
			str = "PASS";
		}
		else {
			str = "NOT PASS";
		}
		System.out.println("결과 : " + str);
		
		sc.close();
		
	}

}
