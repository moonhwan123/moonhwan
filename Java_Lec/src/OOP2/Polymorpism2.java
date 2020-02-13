package OOP2;

class Animal{
	void breath() {
		System.out.println("숨쉬기");
	}
}

class Lion extends Animal{
	public String toString() {
		return "사자";
	}
}

class Rabbit extends Animal{
	public String toString() {
		return "토끼";
	}
}

class Monkey extends Animal{
	public String toString() {
		return "원숭이";
	}
}

class ZooKeeper{
	
	
	void feed(Animal animal) {
		System.out.println(animal+ " 먹이 주기");
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














