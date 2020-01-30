import java.util.regex.Pattern;

/*
[전화번호 유효성 검사]
010-1111-2222
(010|011)-\d{3,4}-\d{4}


 */


public class Exam_02 {
	public static void main(String[] args) {
		
		String tel = "010-1234-1234";
		String pat = "(010|011)-\\d{3,4}-\\d{4}"; // 패턴
		
		boolean bool = Pattern.matches(pat,tel);
		if(bool) {
			System.out.println(tel+"은 정상");
		}else {
			System.out.println(tel+"은 오류");
		}
		
		
		
	}
}
