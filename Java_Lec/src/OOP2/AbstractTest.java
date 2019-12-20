package OOP2;


/*
[�߻� Ŭ����]
	-Ŭ������ ���赵 ���, �߻�Ŭ������ '�̿ϼ� ���赵'
	-�߻�޼��带 �ϳ��̻� �����ϰ� �ִ� Ŭ����
	-�Ϲݸ޼��尡 �߻�޼��带 ȣ���ϴ� ���� ����(ȣ��� �ʿ��Ѱ��� �����)
	-�ϼ��� ���°� �ƴϹǷ� '�ν��Ͻ� ������ �ȵ�'
	-�ٸ� Ŭ������ �ۼ� �ϴµ��� ����Ǳ� ���� ����
	
[�߻� �޼���]
	-����θ� �ְ�, �����ΰ� ���� �޼���
	-�� �ʿ������� �ڽĸ��� �ٸ��� ������ ��� ���(������ �ο�)
	-�߻�Ŭ������ ��ӹ��� �ڽ�Ŭ�������� �߻�޼��� �����θ� �ϼ�
 */

abstract class Pokemon{
	// ��Ĺ���� �߻�Ŭ����
	String name;
	
	abstract void attack(); // ���� �߻�޼���
	abstract void sound(); // �Ҹ� �߻�޼���
	
	public String getName() {
		return this.name;
	}
}

class Pikachu extends Pokemon{
	
	public Pikachu() {
		this.name = "��ī��";
	}
	
	@Override
	void attack() {
		System.out.println("���� ����");
	}

	@Override
	void sound() {
		System.out.println("��ī ��ī");
	}
	
}

class Squirtle extends Pokemon{
	public Squirtle () {
		this.name = "���α�";
	}

	@Override
	void attack() {
		System.out.println("������ ����");
		
	}

	@Override
	void sound() {
		System.out.println("���� ����");
		
	}
}



public class AbstractTest {

	public static void main(String[] args) {
		
		Pikachu pikachu = new Pikachu();
		System.out.println("�� ���ϸ��� : "+pikachu.getName());
		pikachu.attack();
		pikachu.sound();
						
		
	}

}
