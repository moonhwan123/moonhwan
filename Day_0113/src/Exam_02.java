



public class Exam_02 {
	public static void main(String[] args) {
		
		Tv tv1; 
		tv1 = new Tv();
		//Tv tv1 = new Tv();
		tv1.color = "red";
		tv1.channel = 0;
		tv1.power = false;
		
		String str ;
		str = new String("AAA");
		System.out.println("str = "+str); // ��� ���� ������ -> ��? String�� �� Ư���� ���̽��� �׷�(�������̵� �Ǿ�����)
		System.out.println("tv1 = "+tv1); // ��� �ּҰ� ������.
		
		System.out.println("���� ���� : "+tv1.power);
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		System.out.println("ä�� ���� : "+tv1.channel);
		
	}
}
