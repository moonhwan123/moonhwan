package test01;

//[�������� ���� ȣ��]
//��ü ���� �ɶ� ���� ���� ��������� �ڱⲨ ������
//�����ڴ� ��ӵǴ°� �ƴ�(��� , �޼ҵ常 ��ӵ�)


class FF{
	FF(){
		System.out.println("FF() ������ ȣ��");
	}
}

class GG extends FF{
	GG(){
		System.out.println("GG() ������ ȣ��");
	}
}

class HH extends GG{
	HH(){
		System.out.println("HH() ������ ȣ��");
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		
		HH h1 = new HH();
		
		
	}
}
