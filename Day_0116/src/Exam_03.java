/*
[��� ����]
���ͷ�(10,'a',3.13, "aa")
final ���

��� ����� keyword -> final
 */

class AA{
	final double PI = 3.14;
	final static int MAX = 100; // �빮�� ���
}
public class Exam_03 {
	public static void main(String[] args) {
		
		AA a = new AA();
		int b = 3;
//		a.PI = 314; final�̶� ���ٲ�
		double d = b*a.PI;
	}
}
