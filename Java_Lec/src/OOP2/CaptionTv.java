package OOP2;

class point{
	int x = 10;
	int y = 10;
	
}
class point3D extends point {
	// int x; �ʿ� x
	// int y; �ʿ� x
	int z;
}

//===========================================

class TV{
	boolean power;
	int channel;
	
	void power() {power =! power;}
	void channelup() {++channel;}
	void channeldown() {--channel;}
}

class CaptionTv_test extends TV{
	boolean caption;
	
	void displayCaption(String text) {
		if(caption)
			System.out.println(text);
	}
}


public class CaptionTv {

	public static void main(String[] args) {
		
		/*
		[���]
			-������ Ŭ������ �����ؼ� ���ο� Ŭ���� �ۼ�
			-�� Ŭ������ ����� �ڼ�(�θ�,�ڽ�)�� ���踦 �ξ� �ִ� ��
			-�ڼ� Ŭ������ ����Ŭ������ ��� ����� ���(������,�ʱ�ȭ ���� ��Ӿȵ�)
			-�ڼ��� ��� ������ ���󺸴� ���� �� ����.(���ų� ����.)
			-����  
				>> class �ڼ�Ŭ���� extends ����Ŭ����{
				
				  }
		 */
		point p = new point();
		System.out.println(p.x);
		System.out.println(p.y);
		
		point3D p3d = new point3D();
		System.out.println(p3d.x);
		System.out.println(p3d.y);
		System.out.println();
		
		
		CaptionTv_test ctv = new CaptionTv_test();
		ctv.channel = 10;
		ctv.channelup();
		System.out.println(ctv.channel);
		ctv.caption = true;
		ctv.displayCaption("Hello world");
		

	}

}
