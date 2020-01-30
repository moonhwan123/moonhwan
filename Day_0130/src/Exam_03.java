import java.util.regex.Pattern;

/*
[�̸��� ��ȿ�� �˻�]
1) abc@abc.com
2) abc@abc.co.kr

pattern) \w+@\w+.\w+ -> �� ��쿡�� 1)���� Ŀ���� �ȴ�.
		 \w+@\w+.\w+(\.\w+)? -> ��ȣ���� ���� �־ �ǰ� ��� �ȴ�. (�׷��� ��ȣ��ü�� ����ǥ)
		  						������ ���������� ������ ���� ������ �־�� �ȴٴ� ������ �ȴ�.

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
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		if(bool2) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
		
	}
}
