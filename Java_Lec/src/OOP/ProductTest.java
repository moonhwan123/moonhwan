package OOP;

public class ProductTest {
	
	static int count = 0;
	int serialNo;
	{
		++count;
		serialNo =count;
	}
	
	public ProductTest() {
		System.out.println("������");
	}

	public static void main(String[] args) {
		
		ProductTest p1 = new ProductTest();
		ProductTest p2 = new ProductTest();
		ProductTest p3 = new ProductTest();
		
		
		System.out.println("p1�� ��ǰ��ȣ�� - "+p1.serialNo);
		System.out.println("p1�� ��ǰ��ȣ�� - "+p2.serialNo);
		System.out.println("p1�� ��ǰ��ȣ�� - "+p3.serialNo);
		

	}

}
