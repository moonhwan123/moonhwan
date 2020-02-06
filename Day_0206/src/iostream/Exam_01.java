package iostream;

/*
[입출력 스트림]
바이트 방식 (InputStream , OutputStream)
문자(텍스트) 방식(Reader, Writer)





 */
import java.io.*;


public class Exam_01 {
	public static void main(String[] args) {
		
		File f = new File("c:\\data\\work");
		
		if(f.exists()) { // 파일이나 디렉토리가  존재 하는가?
			f.delete(); // 파일, 디렉토리를 삭제
		}
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {}
		
		System.out.println("시작");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {}
		
		if(!f.exists()) {
			f.mkdir();
		}
		
		
		
		
		
		
		
	}
}
