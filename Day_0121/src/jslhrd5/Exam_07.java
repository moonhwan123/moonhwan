package jslhrd5;

class AA {
	int a;
	
	AA(){}
	AA(int i){
		this.a = i;
	}
	
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


public class Exam_07 {
	public static void main(String[] args) {

		AA a1 = new AA(1);
		AA a2 = new AA(1);
		
		if(a1.equals(a2)) {
			System.out.println("a1 == a2 : " + true);
		}else {
			System.out.println("a1 != a2 : " + false);
		}
	
		
		
		
		
		
		
		
		
	}
}
