import java.io.IOException;

/*
1���� �Է�
System.in.read() --> 1���� �Է¹޾Ƽ� int(����)�� ��ȯ
 */



public class Exam_03 {
	public static void main(String[] args) throws IOException {
		
		System.out.print("�Է� : ");
		byte[] bytes = new byte[100];
		int cnt = System.in.read(bytes);
		
		System.out.println("���ڼ� = "+(cnt-2));
		
		String str = new String(bytes,0,cnt-2); // ���� ������ -2 ���ش�.

		System.out.println("�Է� �ڷ� = "+str);
		System.out.println("���ڼ� = "+str.length());
		
		
		String s = "123";
		if(s.isEmpty()) {
			System.out.println("���ڿ��� ��� ����");
		}else {
			System.out.println("���� : "+s);
		}
		
//		System.out.println("s.isEmpty() = "+s.isEmpty());
		
		
	}
}
