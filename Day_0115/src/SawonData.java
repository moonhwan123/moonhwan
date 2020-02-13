
public class SawonData {

	void sourceDataPrint(Sawon[] sa,int cnt) {
		System.out.print("사번\t이름\t급여\n");
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
						Sawon temp = sa[x]; // 여기서 핵심은 temp를 int가 아닌 Sawon클래스 형으로 선언 되면 주소가 바뀌므로 전체 값이 다 바뀐다.
						                    // 객체와 객체를 바꾸는 방법이다.
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
