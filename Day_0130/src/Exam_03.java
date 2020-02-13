import java.util.regex.Pattern;

/*
[이메일 유효성 검사]
1) abc@abc.com
2) abc@abc.co.kr

pattern) \w+@\w+.\w+ -> 이 경우에는 1)번은 커버가 된다.
		 \w+@\w+.\w+(\.\w+)? -> 괄호안의 것은 있어도 되고 없어도 된다. (그래서 괄호전체에 물음표)
		  						점앞의 역슬래쉬가 없으면 점이 무조건 있어야 된다는 조건이 된다.

 */

public class Exam_03 {
	public static void main(String[] args) {
		
		String email1 = "abc@abc.com";
		String email2 = "abc@abc.co.kr";
		String pat1 = "\\w+@\\w+.\\w+";
		String pat2 = "\\w+@\\w+.\\w+(\\.\\w+)?";
		
		boolean bool1 = Pattern.matches(pat1, email1);
		boolean bool2 = Pattern.matches(pat2, email2);
		
		if(bool1) {
			System.out.println("정상");
		}else {
			System.out.println("오류");
		}
		if(bool2) {
			System.out.println("정상");
		}else {
			System.out.println("오류");
		}
		
		
	}
}

