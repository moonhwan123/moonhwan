
public class Tv { 
	//Tv�� �Ӽ�(�������)
	String color; // �̷��� ���� �� �������� "�������(�ν��Ͻ� ����)"
	int channel;
	boolean power;
	
	//���(�޼���)
	void power() {
		power=!power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	
}
