package OOP2;

public class InstanceofTest {
	public static void main(String[] args) {
		
		FireEngine fe3 = new FireEngine();
		
		if(fe3 instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		}
		if(fe3 instanceof Car) {
			System.out.println("This is a Car instance.");
		}
		if(fe3 instanceof Object) {
			System.out.println("This is a Object instance.");
		}
		
		System.out.println(fe3.getClass().getName());
	}
}
