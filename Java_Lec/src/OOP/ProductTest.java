package OOP;

public class ProductTest {
	
	static int count = 0;
	int serialNo;
	{
		++count;
		serialNo =count;
	}
	
	public ProductTest() {
		System.out.println("생성자");
	}

	public static void main(String[] args) {
		
		ProductTest p1 = new ProductTest();
		ProductTest p2 = new ProductTest();
		ProductTest p3 = new ProductTest();
		
		
		System.out.println("p1의 제품번호는 - "+p1.serialNo);
		System.out.println("p1의 제품번호는 - "+p2.serialNo);
		System.out.println("p1의 제품번호는 - "+p3.serialNo);
		

	}

}
