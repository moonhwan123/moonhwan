import java.io.IOException;

/*
1문자 입력
System.in.read() --> 1문자 입력받아서 int(정수)로 반환
 */



public class Exam_03 {
	public static void main(String[] args) throws IOException {
		
		System.out.print("입력 : ");
		byte[] bytes = new byte[100];
		int cnt = System.in.read(bytes);
		
		System.out.println("글자수 = "+(cnt-2));
		
		String str = new String(bytes,0,cnt-2); // 엔터 때문에 -2 해준다.

		System.out.println("입력 자료 = "+str);
		System.out.println("글자수 = "+str.length());
		
		
		String s = "123";
		if(s.isEmpty()) {
			System.out.println("문자열이 비어 있음");
		}else {
			System.out.println("글자 : "+s);
		}
		
//		System.out.println("s.isEmpty() = "+s.isEmpty());
		
		
	}
}
