package iostream;

/*
[����� ��Ʈ��]
����Ʈ ��� (InputStream , OutputStream)
����(�ؽ�Ʈ) ���(Reader, Writer)





 */
import java.io.*;


public class Exam_01 {
	public static void main(String[] args) {
		
		File f = new File("c:\\data\\work");
		
		if(f.exists()) { // �����̳� ���丮��  ���� �ϴ°�?
			f.delete(); // ����, ���丮�� ����
		}
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {}
		
		System.out.println("����");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {}
		
		if(!f.exists()) {
			f.mkdir();
		}
		
		
		
		
		
		
		
	}
}
