package sawon;

import java.text.DecimalFormat;

public class Sawon {
	int sabun;
	String name;
	int money;
	String str;
	
	Sawon(int sabun, String name, int money){
		this.sabun = sabun;
		this.name = name;
		this.money = money;
		
		DecimalFormat df = new DecimalFormat("#,###");
		str = df.format(money);
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(sabun+"\t");
		sb.append(name+"\t");
		sb.append(str+"\n");
		return sb.toString();
	}
	
}
