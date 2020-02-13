import java.util.Scanner;
import java.util.regex.Pattern;

/*
[정규표현식] - Pattern클래스 
데이터 유효성 검사시 자주 사용
\\d - 숫자 1글자 , \\w - 문자 또는 숫자
\\d? - 숫자가 없음 또는 1자 , \\d* - 1자 이상 ,
\\d{3} - 숫자 3자 , \\d{1,3} -> 1자이상 3자 이내 ,

키보드로 정수를 입력 1개 이상 

 */

public class Exam_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		String[] var = sc.nextLine().split(",");
		
		for(int x = 0; x < var.length; x++) {
			boolean bool = Pattern.matches("\\w*", var[x]); // 숫자이면 true, 아니면 false
															// 패턴 클래스는 스태틱 메서드 이기때문에 클래스명으로 직접 호출한다.
															// 리턴타입은 boolean이다.
			if(bool) {
				System.out.println(var[x]+"는 숫자");
			}else {
				System.out.println(var[x]+"는 오류");
			}
		}
		
		
		
	}
}

