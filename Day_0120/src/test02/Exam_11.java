package test02;

abstract class Animal{
	String kind;
	
	void test() {
		System.out.println("운동을 합니다.");
	}
	
	abstract void sound();
}

class Dog extends Animal{
	@Override // @ : 애너테이션
	void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("야옹");
		
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

