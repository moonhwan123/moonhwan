import java.util.List;
import java.util.Vector;

public class Exam_04 {
	public static void main(String[] args) {
		
		List list = new Vector();
//		list.capacity();  ȣ�� �Ұ� capacity�� Vector�� �޼����̱� �����̴�.
		
		Vector vc = new Vector();
		vc.capacity();
		System.out.println(vc.size()); // ���� ����� ������Ʈ ����
		System.out.println(vc.capacity()); // Ȯ���� ����(�⺻ũ��� 10 ������ , StringBufferó�� �ڵ����� ������)
		
		System.out.println("=================");
		
		vc.add("AAAA");
		vc.add(0, "BBBB"); // ���ԵǸ� �����ִ� ����� �ڷ� ���� �Ǵ°� �ƴ϶�, "�и���."
		vc.add("DDDD");
		//�׷��� ���Ի����� ����� �Ͼ�� �׸�ŭ �ӵ��� ������ (�ӵ������� ����)
		//�׷� ��Ȳ������ LinkedList�� ����Ѵ�.
		
		for(int x = 0 ; x < vc.size(); x++) {
			System.out.println(vc.get(x));
		}
		
		
		
	}
}
