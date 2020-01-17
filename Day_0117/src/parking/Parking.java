package parking;

public class Parking {
	String carNum;
	int parkTime;
	int money;
	
	public Parking() {}
	public Parking(String carNum, int parkTime) {
		this.carNum = carNum;
		this.parkTime = parkTime;
		
		if(parkTime<10) {
			money = 0;
		}
		else if(parkTime < 30) {
			money = 500;
		}
		else{
			money = 500 + ((parkTime-21)/10 * 500);
			if(money > 30000) money = 30000;
		}
		
	}
	
	void print() {
		System.out.print(carNum+"\t"+parkTime+"\t"+money+"\n");
	}

}
