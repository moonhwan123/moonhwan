package test01;

//3������ �Ѱ� �׽�Ʈ


class Tv{
	String model;
	int inch;
	
	Tv(String model, int inch){
		this.model = model;
		this.inch = inch;
	}
	
	void printTv() {
		System.out.println("Tv �� : " + model);
		System.out.println("Tv ũ�� : " + inch);
	}
}

final class DigitalTv extends Tv { // ��� ���迡 final�� ���̸� ���̻� ����� ��� ���� �ʰڴ�. ��� �ǹ�
	
	DigitalTv(){ // ������ ����Ŭ������ "����Ʈ ������"�� �����
		super("�Ｚ",16); // ����Ŭ������ ������(���� ����Ʈ������ ������ �̷������� ������ ȣ�� ����ߵ�)
	}
	
}

//class SmartTv extends DigitalTv{
	
//}

public class Exam_04 {
	public static void main(String[] args) {
		
		
		
		
	}
}
