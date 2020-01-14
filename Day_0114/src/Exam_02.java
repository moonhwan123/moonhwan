
/*
[��ü ���� ���α׷���(OOP)]
1.Ŭ���� : �߻�ȭ����(�Ӽ�-�������, ����(���)-�޼���)
2.�ν��Ͻ�(��ü) : Ŭ������ ���� ������� ��ü
3.�޽���(�޼ҵ�) : ��ü�鰣�� ��ȣ�ۿ��� ���� ���

# �� ���迡 ���ֳ��� ����

[��ü ���� 3���]
1.ĸ��ȭ : Ŭ���� ���ο� ���ǵ� ���� �ܺο��� �޼��带 �̿��ؼ� ���� (������ ����->private)
2.��Ӽ� : �θ�Ŭ������ ���� �����޴°�
3.������ : �̸��� ������ ����� �ٸ�
	+�������̵� : �θ�� ���� ���� �޾����� Ư���� �ٸ�(��Ӱ��迡���� �����ϴ°�)
			      ����Ŭ������ ���ͻ�ӹ��� �޼����� ������ ��ӹ��� Ŭ������ �°� '�����ϴ°�'
	+�����ε� : �ϳ��� Ŭ������ ���� �̸��� �޼��带 ������ �����ϴ� ��
 */

/*
[���콺 ��ü �𵨸�]
-�Ӽ� : ��ư�� ���� , ��/����, ���� 
-��� : ���ʹ�ư Ŭ��, ���ʹ�ư ����Ŭ��, �����ʹ�ư Ŭ��

 */

class Mouse2{
	//�Ӽ� ����(�������)
	int btnNum = 2; //��ư����
	boolean wifi = true; //����(false)����(true)����
	String color = "Black"; //����
	
	//������
	Mouse2(){}
	Mouse2(int btnNum, boolean wifi, String color){
		this.btnNum = btnNum;
		this.wifi = wifi;
		this.color = color;		
	}
	
	//�ڱ��ڽ��� ���
	void mousePrint() {
		System.out.println("========================");
		System.out.println("��ư ���� : " + this.btnNum);
		System.out.println("������ ���� : " + this.wifi);
		System.out.println("���� : " + this.color);
		System.out.println("========================");
	}
	
	//��ư Ŭ�� �޼ҵ�
	//��ư�� 2�� �϶�(1-����, 2-������)
	//��ư�� 3�� �϶�(1-����, 2-������, 3-��)
	void buttonClick(int btn) {
		if(this.btnNum<1) {
			System.out.println("����");
			return;
		}
		if(btn == 1) {
			System.out.println("���ʹ�ư Ŭ��");
			return;
		}
		if(this.btnNum == 1 && btn == 2) {
			System.out.println("������ ��ư ���� ����");
		}
		if(btn==2 && this.btnNum > 1) {
			System.out.println("�����ʹ�ư Ŭ��");
			return;
		}
		if(this.btnNum == 2 && btn == 3) {
			System.out.println("�� ��ư ���� ����");
		}
		if(btn==3 && this.btnNum > 2) {
			System.out.println("�� ��ư Ŭ��");
			return;
		}
		
	}

	
	
	
	
}


public class Exam_02 {
	public static void main(String[] args) {

		Mouse2 m1 = new Mouse2(2,true,"Black");
		m1.mousePrint();
		m1.buttonClick(3);
		
		Mouse2 m2 = new Mouse2(3,false,"Red");
		m2.mousePrint();
		m2.buttonClick(3);
		
		Mouse2 m3 = new Mouse2(1,true,"white");
		m3.mousePrint();
		m3.buttonClick(2);
		
		
				
			
	}
}
