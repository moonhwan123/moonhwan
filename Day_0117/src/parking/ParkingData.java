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
		System.out.print("�ڵ�����ȣ\t�����ð�\t�������\n");
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
		System.out.println("[���� ���]");
		System.out.print("�� �������\t\t�� ���\n");
		System.out.print(cnt+"\t"+"\t"+todayFee());
	}
	
	
}
