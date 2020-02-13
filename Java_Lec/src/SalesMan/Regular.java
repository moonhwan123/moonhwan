package SalesMan;

public class Regular extends Employee {
	private int salary;
	public Regular(String name, int age, int salary) {
		super(name,age);
		this.salary = salary;
	}

	
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
	@Override
	public double pay() {
		return salary;
	}

	@Override
	public void print() {
		display();
		System.out.println(", 고정급 : "+pay()+"원");
	}
	
	

	
	

}
