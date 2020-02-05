import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/*
uncompress�Լ��� ���ڿ� ���ĺ����� ������ ���ڿ��� �Է� �޾Ƽ�
���ڸ�ŭ ���ĺ��� �ݺ����� ��ȯ�ϴ� �Լ��̴�.
��)
uncompress('2a5b1c') -> aabbbbbc
uncompress('3x5y2z') -> xxxyyyyyzz

�̶� ���ڴ� 1~9���̿� �ִ� �����̴�.
���ڿ� ���ڿ��� �ݺ��Ǿ� ���´�. �� 1~9 ������ ���� �ڿ� ���ĺ��� �ϳ� ������ ������ �ݺ��ȴ�.

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
