package OOP;

public class variable {

	public static void main(String[] args) {
		/*
		 ���� ��ġ�� ���� ������ ����
		 
		 -Ŭ���� ����
		 	���� ��ġ : Ŭ���� ����
		 	���� �ñ� : Ŭ������ �޸𸮿� �ö� ��
		 		>�ν��Ͻ� ���� �տ� static
		 		>��� �ν��Ͻ��� ����� ����ﰣ�� ����
		 		>�� Ŭ������ ��� �ν��Ͻ� ���� �������� ���� ���� �ؾ� �ϴ� ���
		 		
		 		
		 -�ν��Ͻ� ����
		 	���� ��ġ : Ŭ���� ����
		 	���� �ñ� : �ν��Ͻ��� �����Ǿ��� ��
		 		>�ν��Ͻ� ���� �ʼ�, �������� ���� ������ �����Ƿ� ���� �ٸ� ���� ���� �� �ִ�.
		 		>�ν��Ͻ����� ������ ���¸� �����ؾ� �ϴ� ��� ���
		 		
		 -���� ����
		 	���� ��ġ : Ŭ���� ���� �̿��� ����(�޼���,������,�ʱ�ȭ �� ����)
		 	���� �ñ� : ���� ������ ���� �Ǿ��� ��
		 		>�޼��� ������ ����Ǿ� �޼��� �������� ��밡��
		 		>�޼��尡 ����Ǹ� �Ҹ�
		 		
		 */
		
		System.out.println("Card.width : "+Card.width); // Ŭ���������� ���� �������� ���ص� ��밡��
		System.out.println("Card.height : "+Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.num = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.num = 4;
		
		System.out.println("c1�� "+c1.kind+c1.num+"�̸� , ũ���("+c1.width+","+c1.height+")");
		System.out.println("c2�� "+c2.kind+c2.num+"�̸� , ũ���("+c2.width+","+c2.height+")");
		
		c1.height = 50;
		c1.width = 100; // ��ü�� �ٲ�� ���� �̷��� �ϸ�
		
		System.out.println("c1�� "+c1.kind+c1.num+"�̸� , ũ���("+c1.width+","+c1.height+")");
		System.out.println("c2�� "+c2.kind+c2.num+"�̸� , ũ���("+c2.width+","+c2.height+")");
		
		//�ν��Ͻ� ������ �ν��Ͻ��� ������ ������ �����ǹǷ� ���� �ٸ� �� ����
		//Ŭ���� ������ ��� �ν��Ͻ��� �ϳ��� ���� ������ �����ϹǷ� �׻� ����� ��
		
	}

}

class Card{
	String kind; 
	int num;
	// ���̿� ���ڴ� ������
	
	static int width = 100;
	static int height = 250;
}


