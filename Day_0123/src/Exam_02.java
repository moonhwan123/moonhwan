/*
[String Class]
-> ������ ������ ó��
[StringBuffer/Builder] 
-> ������ ����޸𸮸� ���°� �ƴ϶� ���ۿ��� ���ڸ� ��ȯ��Ű�ų� ��
-> ������ ���ڿ��� ó�� 
-> ��Ƽ�����带 �����ϴ°� (���۴� ��Ƽ������ȯ�濡�� ����ȭ(���û��x,�ο����� ����)����, ������ �ȵ�)

 */

public class Exam_02 {
	public static void main(String[] args) {
		
		String str = "aaaaa";
		String str2 = new String("aaaaa");
		
		StringBuffer sb = new StringBuffer(); // �ݵ�� new ��� �ؾ���, ��ȣ���� ������ ������ �⺻ 16�� ���� ����		
		StringBuffer sb2 = new StringBuffer(20); // �ٵ� �������൵ ���� �˾Ƽ� �þ�� �׷���. ���� 16�� Ŀ��
		
		System.out.println("sb����ũ�� = " + sb.capacity()); //������ ũ��
		System.out.println("sb���ڼ� = " + sb.length()); //���� ����� ������
		

		sb.append("AAAA"); //append�� �̿��ؼ� �߰��Ѵ�.
		sb.append("BBBBBBBB");
		sb.append("CCCCCCCCCC"); // �ڿ� �� �߰�����
		
		
		System.out.println(sb);
		System.out.println("sb����ũ�� = " + sb.capacity()); //������ ũ�� 
		System.out.println("sb���ڼ� = " + sb.length()); //���� ����� ������
		
		
		
		
	}
}
