package jslhrd5;

class AA {
	int a;
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof AA) {
			return a == ((AA)obj).a;
						// �Ű������� �޴� ���� ObjectŬ������ ������ AA�� �ɽ��� �������
		}else {
			return false;
		}
	}

}
class BB{
	
}

public class Exam_07 {
	public static void main(String[] args) {

		AA a1 = new AA();
		AA a2 = new AA();
		
		if(a1.equals(a2)) {
			System.out.println("a1 == a2 : " + true);
		}else {
			System.out.println("a1 != a2 : " + false);
		}
	
		
		
		
		
		
		
		
		
	}
}
