/*
[������]
1. ������ ���� �ε�
2. ������ ȣ�� : this() , this
 */

class EE{
	int x;
	int y;
	EE(){
		this(100);
		System.out.println("default ������ ȣ��");
//		this(100,200);     -> ù�ٿ� �� �ѹ� ȣ�� ������
	}
	EE(int x){
		this(x,200);
		this.x = x;
		System.out.println("�Ű� ���� 1�� ������ ȣ��");
	}
	EE(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("�Ű� ���� 2�� ������ ȣ��");
	}
}


public class Exam_06 {
	public static void main(String[] args) {
		
		EE e1 = new EE();
		System.out.println("x = "+e1.x);
		System.out.println("y = "+e1.y);
		
		
		
		
	}
}
