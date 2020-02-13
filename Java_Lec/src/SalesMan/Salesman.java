package SalesMan;

public class Salesman extends Regular{
	
	private int salse;
	private double commission;
	
	public Salesman(String name, int age, int salary, int sales,double commission) {
		super(name, age, salary);
		this.salse = salse;
		this.commission = commission;
	}

	@Override
	public double pay() {
		return super.pay()+(salse*commission);
	}

	@Override
	public void print() {
		display();
		System.out.println(", 수령액 : "+pay()+"원");
	}
	
	
	
	
}

