package jlshrd4;

import java.io.IOException;

/*
[���� ó��]
�ֻ��� Ŭ���� - Exception





 */

/*
[try-catch�� �̿��� ���� ó��]
 */
public class Exam_05 {
	public static void main(String[] args) {

		// try�ȿ��� ���ܰ� �Ͼ�� �ִ� ���ɼ��� �ִ� �ڵ带 �־� �ش�.
		// �׷��� e��� ������ �� ���ܸ� �޴´�.
		try {
			int a = System.in.read();
			System.out.println(a);
		} catch (IOException e) {
			System.out.println("���ܰ� �߻�");
			// "�ϳ��� try�� �ȿ� �������� catch��"�� �ü� �ִ�.
			// ������ �Ʒ��� ������ ������ ū �������� �Ѵ�.
		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			// "���� �߻��� �������" ����
			// �߻��ص� ���� ���ص� ���� -> ������ ����
		}
		
		
		
		
		
		
		

	}
}
