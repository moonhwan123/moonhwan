import java.io.IOException;

/*
[System.in.read();]
- 1���ڸ� Ű����� �Է� �޾Ƽ� '����'�� ��ȯ

 */

public class Exam_04 {
	
	public static void main(String[] args) throws IOException {
		 
		System.out.print("�Է� �ϼ��� : "); // A�� �Է��Ѵٰ� ���� , 123�� �Է��Ѵٰ� ���� 
		int ch1 = System.in.read();     // 65(A)         ,  49(1)
		int ch2= System.in.read();      // 13(\r)        ,  50(2)
		int ch3 = System.in.read();     // 10(\n)        ,  51(3)
		
		System.out.println("ch1 = " + ch1);
		System.out.println("ch2 = " + ch2);
		System.out.println("ch3 = " + ch3);
		
		
	}

}
