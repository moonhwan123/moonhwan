package OOP2;

/*
Singleton - �������� ����������
	-�Ϲ������� �������� ���������ڴ� Ŭ������ ���������ڿ� ��ġ
	-�����ڿ� ���������ڸ� ����ϹǷν� �ν��Ͻ��� ������ ���� ����
 */
final class singletone{
	
	private static singletone s = new singletone();
	
	private singletone() {
		
	}
	public static singletone getInstance() {
		if(s==null) {
			s = new singletone();
		}
		return s;
		
	}
	
}
public class singleton {

	public static void main(String[] args) {
//		singletone = new singletone();   -> ���⼭�� �ٷ� �����Ұ�
		
		singletone s = singletone.getInstance();

	}

}
