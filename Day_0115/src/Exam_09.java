/*

[�̱���] - Singleton 
-�������� ����������
-�Ϲ������� �������� ���������ڴ� Ŭ������ ���������ڿ� ��ġ
-�����ڿ� ���������ڸ� ����ϹǷν� �ν��Ͻ��� ������ ���� ����

>> new�� ������ �ؾ��Ҷ�
>> ��ü�� ���� �ϰ� ������ ����Ѵ�.
>> �����ͺ��̽��� �����Ҷ�

 */

class DataB{
	private static DataB data = new DataB();
	// �ڱⰡ �ڱ��ڽ��� ��ü�� �������� �ڱ⸸ �ȿ��� ����� �Ѵ�.
	private DataB() {
		// �����ڿ� private���̸� new����
	}
	static DataB getInstance() {
		return data;
	}
	//static�� ���� ��������� �޼ҵ�� "Ŭ���� �̸�"���� ���� ȣ���Ѵ�.
}
public class Exam_09 {
	public static void main(String[] args) {
		
		DataB d1 = DataB.getInstance();
		DataB d2 = DataB.getInstance();
		
		System.out.println("d1 == d2 : " + (d1==d2));
		
		
		
	}
}
