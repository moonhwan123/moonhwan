package test02;

interface Control{
	int MAX_VOLUME=10; // static final ����
	int MIN_VOLUME=0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//����Ʈ �޼ҵ� (jdk1.8���� ����)
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("����ó��");
		}else {
			System.out.println("��������");
		}
	}
	//����ƽ �޼ҵ�
	static void changeBattery() {
		System.out.println("������ ��ü");
	}
	//�������̽� �������
	//���, �߻�޼ҵ�, ����Ʈ�޼ҵ�, ����ƽ �޼ҵ�
}

class Tv implements Control {
	private int volume;
	
	void print() {
		System.out.println("Tv.volume = " + volume);
	}
	@Override
	public void turnOn() {
		System.out.println("TV ON");
	}
	@Override
	public void turnOff() {
		System.out.println("TV OFF");
	}
	@Override
	public void setVolume(int volume) {
		if(volume > Control.MAX_VOLUME) {
			this.volume = Control.MAX_VOLUME;
		}else if (volume < Control.MIN_VOLUME) {
			this.volume = Control.MIN_VOLUME;
		}
		System.out.println("���� TV ������ "+ this.volume+ "�Դϴ�.");
	}
	
	
}



public class Exam_14 {
	public static void main(String[] args) {
		
		Tv t = new Tv();
		t.turnOn();
		t.setVolume(15);
		t.setMute(true);
		
		
		
		
		
	}
}
