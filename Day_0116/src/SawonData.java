
public class SawonData {
	int arr[] = new int[10];
	int arrMoney[] = new int[1];
	
	void addPay(Sawon sa[] ,int cnt) {
		for(int x = 0; x < cnt ; x++) {
			arrMoney[0] += sa[x].pay;
		}
	}
	void addMoney(Sawon sa[] ,int cnt) {
		for(int x = 0; x < arr.length ; x++) {
			for(int y = 0 ; y < cnt; y++)
			arr[x] += sa[y].money[x];
		}
	}
	
	void saPrint(Sawon sa[] ,int cnt) {
		System.out.print("���\t�̸�\t�޿�\t50,000��\t10,000��\t5,000��\t1,000��\t500��\t100��\t50��\t10��\t5��\t1��\n");
		for(int x = 0; x < cnt; x++) {
			sa[x].sPrint();
		}
		addPrint(cnt);
	}
	
	private void addPrint(int cnt) {
		System.out.print("�հ�\t\t");
		System.out.print(arrMoney[0]+"\t");
		for(int x = 0 ; x < arr.length; x++){
			System.out.print(arr[x]+"\t");
		}
		System.out.println();
	}
	
	
}
