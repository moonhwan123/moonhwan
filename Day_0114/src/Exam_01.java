
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

class Mouse{
	//�Ӽ� ����(�������)
	private int btnNum = 2; //��ư����
	private boolean wifi = true; //����(false)����(true)����
	private String color = "Black"; //����
	
	//������(Ŭ���� �̸��� �Ȱ��� �޼���) ���� , ������ �����ε�
	//������ ��� ���� -> ��ü ������ �ʱ�ȭ�� �Բ� �ϱ�����
	Mouse() {}
	Mouse(int btnNum){
		this.btnNum = btnNum;
	}
	Mouse(int btnNum,boolean wifi){
		this.btnNum = btnNum;
		this.wifi = wifi;
	}
	Mouse(int btnNum,boolean wifi, String color){
		this.btnNum = btnNum;
		this.wifi = wifi;
		this.color = color;
	}
	
	public void setBtnNum(int btnNum) {
		this.btnNum = btnNum;
	}
	
	//��� ����
	void leftClick() {
		System.out.println("���� ��ư�� Ŭ�� �Ǿ����ϴ�.");
	}
	void rightClick() {
		System.out.println("������ ��ư�� Ŭ�� �Ǿ����ϴ�.");
	}
	int doubleClick() {
		System.out.println("���� ��ư�� ���� Ŭ�� �Ǿ����ϴ�.");
		return 1;
	}
	//�ڽ��� ���
	void mPrint() {
		System.out.println("��ư ���� : " + this.btnNum);
		System.out.println("���� : " + this.color);
		if(this.wifi) {
			System.out.println("������ ���� : ����");
		}else System.out.println("������ ���� : ����");
		System.out.println("=====================");
	}
	
	
}


public class Exam_01 {
	public static void main(String[] args) {
		// 1. ��ü���� 
		Mouse mou1; // �ν��Ͻ�(���۷���,����)���� ����
		mou1 = new Mouse(); // new�� �̿��� ��ü����
		mou1.setBtnNum(5);
		mou1.mPrint();	
		
		Mouse mou2 = new Mouse(4);
		mou2.mPrint();		
		
		Mouse mou3 = new Mouse(10,false);
		mou3.mPrint();
		
		Mouse mou4 = new Mouse(10,false,"Red");
		mou4.mPrint();
		
				
			
	}
}
