package SalesMan;

public abstract class Employee {
	
	private String name;
	private int age;
	
	public Employee(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract double pay();
	public abstract void print();
	
	public void display() {
		System.out.print("이름 : "+name+" 나이 : "+age);
	}

}
