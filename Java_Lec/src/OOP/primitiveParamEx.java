package OOP;

class Data{
	int x;
}

public class primitiveParamEx {
	
	static void change(int x) { // 기본형 매개변수
		x = 1000;
		System.out.println("change() : x = "+x);
	}

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = "+d.x); // (1)
		
		change(d.x); // (2)
		
		System.out.println("After change(d.x) : x =" +d.x); // (3)

	}

}
