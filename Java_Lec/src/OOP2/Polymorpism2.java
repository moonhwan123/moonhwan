package OOP2;

class Animal{
	void breath() {
		System.out.println("������");
	}
}

class Lion extends Animal{
	public String toString() {
		return "����";
	}
}

class Rabbit extends Animal{
	public String toString() {
		return "�䳢";
	}
}

class Monkey extends Animal{
	public String toString() {
		return "������";
	}
}

class ZooKeeper{
	
	
	void feed(Animal animal) {
		System.out.println(animal+ " ���� �ֱ�");
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














