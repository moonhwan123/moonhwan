package jslhrd4;

import java.io.IOException;

/*
[throws�� �̿��� ���� ó��]
throws : "���� ȣ���� ���"���� ������ ������.
throw : ������ ���� �߻� , ���������� ���� �߻���Ű��
	->�� ���� ���� ����

����ó�� 2���� ��� ���� 
����ó�� �ϴ���, ���ѱ����
 */

class AA {
	char input() throws IOException {
		char ch = (char) System.in.read();
		return ch;
	}
}

class BB {
	char input() {
		char ch = '\0';
		try {
			ch = (char) System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ch;
	}
}

public class Exam_06 {

	public static void main(String[] args) {

		AA a = new AA();
		try {
			char c1 = a.input(); // ���⼭�� ���ܰ� �߻� 
			System.out.println("�Է�  �� : " + c1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		if(ddd) {
//			throw new Exception();
//		}
		
		
		BB b = new BB();
		char c2 = b.input(); // ���⼭�� ������ �߻� ���� �ʴ´�. ������ ���� ó���� �߱� ������
		System.out.println("�Է�  �� : " + c2);

	}

}
