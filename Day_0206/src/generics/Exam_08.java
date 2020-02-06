package generics;

class Product<T,M>{
	private T kind;
	private M model;
	
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
}

class Car{
	
}

public class Exam_08 {
	public static void main(String[] args) {
		
		Product<String,Integer> pdt = new Product<String,Integer>();
		
		pdt.setKind("Camera");
		pdt.setModel(1011);
		
		System.out.println(pdt.getKind());
		System.out.println(pdt.getModel());
		
		
		
		
		
		Product<Car,Integer> pdt2 = new Product<Car,Integer>();
		
		Car c = new Car();
		
		pdt2.setKind(c);
		pdt2.setModel(1013);
		
		System.out.println(pdt2.getKind());
		System.out.println(pdt2.getModel());
		
	}
}
