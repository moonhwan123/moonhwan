package parking;

public class ParkingData {
	Parking[] p1;
	int cnt;
	int total;
	
	public ParkingData() {}
	public ParkingData(Parking[] p1,int cnt) {
		this.p1 = p1;
		this.cnt = cnt;
		
	}
	
	
	
	void totalPrint(){
		System.out.print("자동차번호\t주차시간\t주차요금\n");
		for(int x = 0; x < cnt; x++) {
			p1[x].print();
		}
	}
	private int todayFee() {
		for(int x = 0; x < cnt; x++) {
			total += p1[x].money;
		}
		return total;
	}
	
	void today() {
		System.out.println("[당일 결산]");
		System.out.print("총 주차대수\t\t총 요금\n");
		System.out.print(cnt+"\t"+"\t"+todayFee());
	}
	
	
}
