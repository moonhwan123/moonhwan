package sawon2;

public class SawonData {
	Sawon[] sa;
	int cnt;
	boolean sw;
	int total;
	
	SawonData(){}
	SawonData(Sawon[] sa , int cnt){
		this.sa=sa;
		this.cnt=cnt;
	}
	
	
	
	void totalPrint() {
		System.out.println("** �޿� ���� ���α׷� **");
		System.out.print("�μ���\t���\t�̸�\t�޿�\n");
		System.out.println("-----------------------------");
		
		System.out.print(sa[0].getBuseo()+"\t"+sa[0].getSabun()+"\t");
		System.out.print(sa[0].getName()+"\t"+sa[0].getPay()+"\n");
	
		
		
		
		for(int x = 1; x < cnt; x++) {
			if(sa[x].getBuseo().equals(sa[x-1].getBuseo())) {
				System.out.print("\t"+sa[x].getSabun()+"\t");
				System.out.print(sa[x].getName()+"\t"+sa[x].getPay()+"\n");
				
			}else {
				System.out.println("�հ�\t\t\t"+total);
				System.out.print(sa[x].getBuseo()+"\t"+sa[x].getSabun()+"\t");
				System.out.print(sa[x].getName()+"\t"+sa[x].getPay()+"\n");
			}	
		}
		System.out.println("�հ�\t\t\t"+total);
		

		
		
		
		
		
		
		
	}
	
	
}
