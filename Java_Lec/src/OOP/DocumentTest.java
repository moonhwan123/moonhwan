package OOP;

public class DocumentTest {
	
	static int count = 0;
	String name;
	
	public DocumentTest() {
		this("�������"+ ++count);
	}
	public DocumentTest(String name) {
		this.name = name;
		System.out.println("���� "+this.name +"�� �����Ǿ����ϴ�.");
		
	}
	
	public static void main(String[] args) {
		DocumentTest d1 = new DocumentTest();
		DocumentTest d2 = new DocumentTest("�ڹ�.txt");
		DocumentTest d3 = new DocumentTest();
		DocumentTest d4 = new DocumentTest("�ڹ�.txt");
	}
}
