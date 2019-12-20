package SalesMan;

import javax.xml.ws.Dispatch;

public class Manager extends Regular {
	
	private double incentive;

	public Manager(String name, int age, int salary) {
		super(name, age, salary);
		this.incentive = incentive;
	}

	@Override
	public double pay() {
		
		if(super.pay()>=2500000) {
			incentive = super.pay()+super.pay()*0.6;
		}
		else if (super.pay()>=2000000) {
			incentive = super.pay()+super.pay()*0.5;
		}
		else if (super.pay()<2000000) {
			incentive = super.pay()+super.pay()*0.4;
		}
		return incentive;
	}

	@Override
	public void print() {
		display();
		System.out.println(", 수령액 : "+pay()+"원");
	}
	
}
