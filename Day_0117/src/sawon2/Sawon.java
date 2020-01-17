package sawon2;

public class Sawon {
	private String buseo;
	private int sabun;
	private String name;
	private int pay;
	
	public String getBuseo() {
		return buseo;
	}
	public void setBuseo(String buseo) {
		this.buseo = buseo;
	}
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	
	public Sawon(){}
	public Sawon(String buseo, int sabun, String name, int pay){
		this.buseo = buseo;
		this.sabun = sabun;
		this.name = name;
		this.pay = pay;
	}
	
	
	
	
	

}
