import java.io.IOException;

/*
ǥ���Է�
System.in.read(); -- 1���� �Է� -- ������ ��ȯ
�ݵ�� ����ó�� �ʿ�
 */


public class Exam_02 {
	public static void main(String[] args) throws IOException {
		
		System.out.print("1���� �Է� �ϼ��� >> ");
		
		System.in.read();
		System.in.read();
		int ch = System.in.read(); // 'A'�� �Է��ϸ� A�� �ش��ϴ� �ƽ�Ű �ڵ� ���� ��  
		                           //   \n - 10�� ,\r - 13�� , A - 65�� , a - 97�� 
		
		System.out.print("ch = "+ch);
		System.out.println();
		
		System.out.print("1���� �Է� �ϼ��� >> ");
		char ch_1 = (char)System.in.read(); // ���� ����ȯ
		System.out.println("ch_1 = "+ch_1);
		
		
		
		
		
		
	}

}
