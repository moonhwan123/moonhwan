package OOP2;

class Animal{
	void breath() {
		System.out.println("¼û½¬±â");
	}
}

class Lion extends Animal{
	public String toString() {
		return "»çÀÚ";
	}
}

class Rabbit extends Animal{
	public String toString() {
		return "Åä³¢";
	}
}

class Monkey extends Animal{
	public String toString() {
		return "¿ø¼şÀÌ";
	}
}

class ZooKeeper{
	
	
	void feed(Animal animal) {
		System.out.println(animal+ " ¸ÔÀÌ ÁÖ±â");
	}
}


public class Polymorpism2 {
	public static void main(String[] args) {

		
		Animal lion = new Lion();
		Animal rabbit = new Rabbit();
		Animal monkey = new Monkey();
		ZooKeeper james = new ZooKeeper();
		
		james.feed(lion);
		james.feed(rabbit);
		james.feed(monkey);
		
		
	}
}














