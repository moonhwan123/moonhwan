package SalesMan;

public class Temporary extends Employee {
	
	private int ilsu;
	private int ildang;
	
	public Temporary(String name, int age, int ilsu, int ildang) {
		super(name,age);
		this.ildang = ildang;
		this.ilsu = ilsu;
	}

	public int getIlsu() {
		return ilsu;
	}

	public void setIlsu(int ilsu) {
		this.ilsu = ilsu;
	}

	public int getIldang() {
		return ildang;
	}

	public void setIldang(int ildang) {
		this.ildang = ildang;
	}

	
	@Override
	public double pay() {
		return ilsu*ildang;
	}

	@Override
	public void print() {
		display();
		System.out.println(", ¿ù±Ş : "+pay() + "d¿ø");
	}

}
