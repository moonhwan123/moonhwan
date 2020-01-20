package test02;

abstract class Animal{
	String kind;
	
	void test() {
		System.out.println("��� �մϴ�.");
	}
	
	abstract void sound();
}

class Dog extends Animal{
	@Override // @ : �ֳ����̼�
	void sound() {
		System.out.println("�۸�");
	}
}

class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("�߿�");
		
	}
}

public class Exam_11 {
	public static void main(String[] args) {
		
		
		Dog d = new Dog();
		d.sound();
		Cat c = new Cat();
		c.sound();
		
		Animal an = new Dog();
		an.sound();
		an = new Cat();
		an.sound();
		System.out.println("================");
		animalSound(new Dog());
		animalSound(new Cat());
		
	}
	
	static void animalSound(Animal a) {
		a.sound();
	}
	
	
}
