package OOP2;
/*
 ���� ������(Access Modifier)
 	-��� ���� �Ǵ� Ŭ���� ���
 	-�ܺηκ����� ������ ����
 	-Ŭ����,��� ����,�޼���,������
 	
 	private - ���� Ŭ���� �������� ����
 	default - ���� ��Ű�� �������� ���� ����
 	protected - ���� ��Ű�� �������� ���� ����,�ٸ� ��Ű���� �ڼ� Ŭ���������� ���� ����
 	public - ���� ���� X
 	
 	������	���� Ŭ����		���� ��Ű��		�ڼ� Ŭ����		 ��ü
 	public		O			O			O		  O
 	protectd	O			O			O
 	default		O			O
 	private		O
 	
 	
 	���� ������ ������� ( ĸ��ȭ )
 		-�ܺηκ��� ������ ��ȣ
 		-�ܺο��� ���ʿ�,���������� ��� �Ǵ� �κ��� ���߱� ����
 		
 	�������� ����
 		Ŭ���� - public,(default),final,abstract
 		�޼��� - ��� ����������,final,abstract,static
 		������� - ��� ����������,final,static
 		�������� - final
 		
 		�޼��忡 private�� final�� ���� ��� X
 		 	-������� private�� �޼���� �������̵� �Ұ�
 		 	 �� �� �ϳ��� ���
 */
public class TimeTest {
	public static void main(String[] args) {
		time t = new time(10,30,52);
		System.out.println(t);
		t.setHour(13);
	
		
		System.out.println(t);
		
	}
}

class time{
	private int hour;
	private int minute;
	private int second;
	
	time(int hour,int minute,int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() {
		return this.hour;
	}
	public void setHour(int hour) {
		if(hour < 0 || hour > 23)return;
		
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute < 0 || minute > 59)return;
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second < 0 || second > 59)return;
		this.second = second;
	}

	@Override
	public String toString() {

		return hour + " : "+minute+" : "+second;
	}
	
	
}

































