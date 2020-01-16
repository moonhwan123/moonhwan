
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
		System.out.print("사번\t이름\t급여\t50,000원\t10,000원\t5,000원\t1,000원\t500원\t100원\t50원\t10원\t5원\t1원\n");
		for(int x = 0; x < cnt; x++) {
			sa[x].sPrint();
		}
		addPrint(cnt);
	}
	
	private void addPrint(int cnt) {
		System.out.print("합계\t\t");
		System.out.print(arrMoney[0]+"\t");
		for(int x = 0 ; x < arr.length; x++){
			System.out.print(arr[x]+"\t");
		}
		System.out.println();
	}
	
	
}
