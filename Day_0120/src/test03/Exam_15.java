package test03;

class AA{
	int x=10;
	void sum() {
		System.out.println("x = "+x);
	}
}

interface A{
	void test();
	
}

class AAA implements A{
	@Override
	public void test() {
		System.out.println("AAA");
		
	}
}

class BBB implements A{
	@Override
	public void test() {
		System.out.println("BBB");
		
	}
}

class CCC implements A{
	@Override
	public void test() {
		System.out.println("CCC");
		
	}
}

public class Exam_15 {
	public static void main(String[] args) {
		
		
		A a = new AAA();
		a = new BBB();
		a = new CCC();
	}
}
