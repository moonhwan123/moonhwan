
public class TvTest3 {
	public static void main(String[] args) {
		
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		System.out.println("t1�� channel���� "+tv1.channel+"�Դϴ�.");
		System.out.println("t2�� channel���� "+tv2.channel+"�Դϴ�.");
		
		tv2 = tv1;
		
		tv1.channel = 8;
		System.out.println("t1�� channel���� 8�� ���� �Ͽ����ϴ�.");
		
		System.out.println("t1�� channel���� "+tv1.channel+"�Դϴ�.");
		System.out.println("t2�� channel���� "+tv2.channel+"�Դϴ�.");
		
		
	}
}
