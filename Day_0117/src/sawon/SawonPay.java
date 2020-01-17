package sawon;

public class SawonPay {
	Sawon[] bu;
	int cnt;
	int timeTotal;
	double weekPayTotal;
	
	SawonPay(){}
	SawonPay(Sawon[] bu, int cnt){
		this.bu = bu;
		this.cnt = cnt;
	}
	
	private void topWeekPay() {
		for(int x = 0; x < cnt-1; x++) {
			for(int y = x+1; y < cnt; y++) {
				if(bu[x].weekpay < bu[y].weekpay) {
					Sawon temp = bu[x];
					bu[x] = bu[y];
					bu[y] = temp;
				}
			}
		}
	}
	
	
	int timeTotal() {
		for(int x = 0 ; x < cnt; x++) {
			timeTotal += bu[x].time;
		}
		return timeTotal;
	}
	
	double weekPayTotal() {
		for(int x = 0 ; x < cnt; x++) {
			weekPayTotal += bu[x].weekpay;
		}
		return weekPayTotal;
	}
	
	void totalPrint() {
		System.out.print("���̵�\t���\t�ñ�\t�ٹ��ð�\t�ְ��޿�\n");
		for(int x = 0 ; x < cnt; x++) {
			bu[x].sawonPrint();
		}
		System.out.print("�հ�\t\t\t");
		System.out.print(timeTotal()+"\t"+weekPayTotal()+"\n");
	}
	
	void topPrint() {
		System.out.println("[�ְ� �޿��� ���� ���� ���� ���]");
		topWeekPay();
		System.out.print("���̵�\t�ְ��޿�\n");
		System.out.println(bu[0].id+"\t"+bu[0].weekpay);
	}
	
	

}
