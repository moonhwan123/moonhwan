package OOP2;
/*
[�������̽�]
	
	(Ư¡)
	-������ �߻�Ŭ���� (�߻�Ŭ�������� �߻�ȭ ������ ����.)
	-���� ������ ���� ���� ���� �⺻ ���赵
	-�߻�޼���� ������� ����� ������
	-�ν��Ͻ��� ������ �� ����, Ŭ���� �ۼ��� ������ �� �������� ���
	-�̸� ������ �԰ݿ� �°� �����ϵ��� ǥ���� �����ϴµ� ���
	
	
	(��� ���)
	interface �������̽��̸� {
		public static final Ÿ�Ի���̸� = ��;
		public abstract �޼����̸�(�Ű��������); 
	}
	
		//class ��� interface�� ����Ѵٴ� �� �ܿ��� Ŭ������ ����
		//��� ��� ������ public static final �̾�� �ϸ�, public static final��  ��������
		//��� �޼���� public static final �̾�� �ϸ�, public static final��  �������� (�ϳ� �ǵ����̸� ������)	
	
	
	(����)
	-���߽ð� ����
	-ǥ��ȭ ����(����ȭ�� ����)
	-���� ������� Ŭ������ ����ο� ����
	-�������� ���α׷����� ����
 */

public class Interface {

	public static void main(String[] args) {
		
		Figther f = new Figther();
		Fightable f1 = new Figther();
		// �������̽� Ÿ���� ������ �������̽��� ������ Ŭ������ �ν��Ͻ� ��������
		
		if(f instanceof Unit) {
			System.out.println("f�� UnitŬ������ �ڽ��Դϴ�.");
		}
		if(f instanceof Fightable) {
			System.out.println("f�� Fightable�� ���� �߽��ϴ�.");
		}
		if(f instanceof Movable) {
			System.out.println("f�� Movable�� ���� �߽��ϴ�.");
		}
		if(f instanceof Object) {
			System.out.println("f�� ObjectŬ������ �ڽ� �Դϴ�.");
		}
		
		

	}

}

class Unit{
	int currentHp;
	int x;
	int y;
	
}

class Figther extends Unit implements Fightable{
	//�������̽� ���� = Ŭ���� ���
	//�������̽��� ���ǵ� �߻�޼��� ���� �ϼ�
	//��Ӱ� ���� ���ÿ� ����

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		
	}

	
}

interface Fightable extends Movable,Attackable{
	//Ŭ����ó�� ��� ���� (���� ��� ���)
	//Object Ŭ������ ���� �ְ� ���� X
	
}
interface Movable{
	public abstract void move(int x, int y);
}

interface Attackable{
	void attack(Unit u);
}
