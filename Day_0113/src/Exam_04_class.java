class Hak{
	int number;
	String name;
	int kor;
	int eng;
	int mat;
	
}


public class Exam_04_class { // Exam_04�� Ŭ����ȭ �Ѱ��� ������ � ���̰� �ִ��� �����ض�
	public static void main(String[] args) {
		
		Hak[] h1 = new Hak[4]; // Ŭ���� �迭 ( Ŭ������ �迭�� ����� ����, �ᱹ Ŭ������ �ϳ��� �ڷ����̴ϱ�!)
		//h1[0] = 10; //�̰� �ȵ�
		h1[0] = new Hak();
		h1[1] = new Hak();
		h1[2] = new Hak();
		h1[3] = new Hak();
		
		h1[0].number = 1;
		h1[0].name = "AAA";
		h1[0].kor = 90;
		h1[0].eng = 89;
		h1[0].mat = 79;

		h1[1].number = 2;
		h1[1].name = "BBB";
		h1[1].kor = 55;
		h1[1].eng = 69;
		h1[1].mat = 76;
		
		h1[2].number = 3;
		h1[2].name = "CCC";
		h1[2].kor = 40;
		h1[2].eng = 79;
		h1[2].mat = 76;
		
		h1[3].number = 4;
		h1[3].name = "DDD";
		h1[3].kor = 22;
		h1[3].eng = 33;
		h1[3].mat = 64;
		
		int[] a = new int[4];

		
		System.out.println("��ȣ\t�̸�\t����\t����\t����");
		for(int x = 0; x < h1.length; x++) {
			System.out.print(h1[x].number+"\t");
			System.out.print(h1[x].name+"\t");
			System.out.print(h1[x].kor+"\t");
			System.out.print(h1[x].eng+"\t");
			System.out.print(h1[x].mat+"\n");
		}
		//������ �� ���� ��ºκ��� ����������.
		//�տ��� ���°�� ���� ���� �̷��� ����ؾ� ������ ���⼭�� ���������� number������ �������� �˼�����
		
		
		
		
		
		
		
		
	}
}
