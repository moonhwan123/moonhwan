
public class SawonData {

	void sourceDataPrint(Sawon[] sa,int cnt) {
		System.out.print("���\t�̸�\t�޿�\n");
		for(int x = 0; x < cnt; x++) {
			sa[x].print();
			System.out.println();
		}
	}
	void sortDataPrint(Sawon[] sa,int cnt,int n) {
		for(int x = 0; x < cnt-1; x++) {
			for(int y = x+1; y < cnt; y++) {
				if(n==1) {
					if(sa[x].sabun > sa[y].sabun) {
						Sawon temp = sa[x]; // ���⼭ �ٽ��� temp�� int�� �ƴ� SawonŬ���� ������ ���� �Ǹ� �ּҰ� �ٲ�Ƿ� ��ü ���� �� �ٲ��.
						                    // ��ü�� ��ü�� �ٲٴ� ����̴�.
						sa[x] = sa[y];
						sa[y] = temp;
					}
				}else if(n==2) {
					if(sa[x].sabun < sa[y].sabun) {
						Sawon temp = sa[x];
						sa[x] = sa[y];
						sa[y] = temp;
					}
				}
				
			}
		}
		
	}
	
	
}
