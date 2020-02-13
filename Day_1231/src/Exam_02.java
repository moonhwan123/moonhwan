import java.util.Scanner;

/*
if()


switch ~ case
90이상 , 80이상, 70이상, 60이상 , 60미만
100~90 , 89~80 , 79~70 , 69~60, 59~0

 */



public class Exam_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int var = sc.nextInt();
		
		String str = ""; // String str = null; 이거랑은 다른거임
		//char ch = 'A';
		
		switch(var/10) { //수식 또는 변수가 들어감(정수,문자,문자열)
			case 10:	// 값(정수,문자,문자열)
				str = "A";
				break; // 이게 없으면 -> 조건 만족시 밑에 꺼도 다 실행되어 버림
			case 9:
				str = "A";
				break;
			case 8:
				str = "B";
				break;
			case 7:
				str = "C";
				break;
			case 6:
				str = "D";
				break;
			default:
				str = "F";
				
		}
		
		System.out.println("당신의 성적은"+str+"점 입니다.");
		
		
		
		
		
		
		
		
		
		
		
	}

}
