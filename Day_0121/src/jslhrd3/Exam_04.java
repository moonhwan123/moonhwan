package jslhrd3;
/*
[4. �͸���ø Ŭ����]

Ư¡ : Ŭ������ ����, ��ü�� ������ ���ÿ� �ϴ� �̸� ���� Ŭ����(��ȸ��)
            ���� Ŭ������ Ư�� �޼ҵ带 �������̵� �Ͽ� ����ϴ� ���
            �������̵��� �����̶� �͸� �����Ҷ� ���ο� �޼ҵ�� ���� �Ұ�

 */

class Inner4{
	void aaa() {
		System.out.println("aaaaaa");
	}
	void bbb() {
		System.out.println("bbbbbb");
	}
}

public class Exam_04 {
	
	public static void main(String[] args) {
		
		Inner4 in4 = new Inner4();
		
		in4.aaa();
		in4.bbb();
		System.out.println("=========�͸���ø �ǽ�==========");
		//�������̽��� �͸����� ����
		Inner4 in = new Inner4(){
			void aaa() {
				System.out.println("aaaaaa�� �͸� ��ø �Ǿ����ϴ�.");
			}
		};
		
		in.aaa();
		in.bbb();
		
	}
	
}
