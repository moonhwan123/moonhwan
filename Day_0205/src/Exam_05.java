import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/*
uncompress함수는 숫자와 알파벳으로 구성된 문자열을 입력 받아서
숫자만큼 알파벳을 반복시켜 변환하는 함수이다.
예)
uncompress('2a5b1c') -> aabbbbbc
uncompress('3x5y2z') -> xxxyyyyyzz

이때 숫자는 1~9사이에 있는 숫자이다.
숫자와 문자열이 반복되어 나온다. 즉 1~9 사이의 숫자 뒤에 알파벳이 하나 나오는 패턴이 반복된다.

#main
	S = ['2a5b1c' , '3x5y2z' , '2m4n' , '9o']

	for(String str : s){
		String new_String = uncompress(str);
		System.out.print(str + " : " + new_String);
	}

 */

public class Exam_05 {
	
	static String uncompress(String str) {
		
		String pat = "(\\d{1}[a-zA-Z]{1})+";
		StringBuffer strBf = new StringBuffer();
		
		
		if(Pattern.matches(pat, str)) {
			for(int x = 0 ; x < str.length(); x+=2) {
				String s1 = str.substring(x, x+1);
				String s2 = str.substring(x+1, x+2);
				for(int y = 0; y < Integer.parseInt(s1); y++) {
					strBf.append(s2);
				}	
			}
			return strBf.toString();
			
		}else {
			return "error";
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		List<String> s = new ArrayList<String>();
		
		s.add("2a5b1c");s.add("3x5y2z");s.add("2m4n");s.add("9o");
		
		for(String str : s){
			String new_String = uncompress(str);
			System.out.println(str + " : " + new_String);
		}
	}
}
