package thread;

import java.awt.Toolkit;

/*
[��Ƽ ������]
 - ������ => �����ڵ�
 - �ǽð����� ���� ���� ���� ����Ѵ�.
 
 1) Thread Ŭ������ ��� �޾Ƽ�
 
  
 2) Runnable �������̽� ����
 	= ��� � Ŭ������ �ٸ� Ŭ������ ��� ���������̸� ThreadŬ������ ��� ���� �� ���� ������ �����Ѵ�.

	
 */

public class Exam_09 {
	public static void main(String[] args) {

		Toolkit tool = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 10; i++) {
			tool.beep(); // ������ (�Ҹ�)
			try {
				Thread.sleep(500); // sleep : �������� ��� ������ 1000�� 1��
			} catch (Exception e) {

			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("����");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}

	}
}
