package sawon2;

public class SawonData {
	Sawon[] sa;
	int cnt;
	boolean sw;
	int total;
	int payTotal;
	
	SawonData(){}
	SawonData(Sawon[] sa , int cnt){
		this.sa=sa;
		this.cnt=cnt;
	}
	
	
	
	void totalPrint() {
		total=sa[0].getPay();
		System.out.println("** �޿� ���� ���α׷� **");
		System.out.print("�μ���\t���\t�̸�\t�޿�\n");
		System.out.println("-----------------------------");
		
		System.out.print(sa[0].getBuseo()+"\t"+sa[0].getSabun()+"\t");
		System.out.print(sa[0].getName()+"\t"+sa[0].getPay()+"\n");
	
		
		
		
		for(int x = 1; x < cnt; x++) {
			if(sa[x].getBuseo().equals(sa[x-1].getBuseo())) {
				System.out.print("\t"+sa[x].getSabun()+"\t");
				System.out.print(sa[x].getName()+"\t"+sa[x].getPay()+"\n");
				total+=sa[x].getPay();
				
			}else {
				System.out.println("�հ�\t\t\t"+total);
				total=sa[x].getPay();
				System.out.print(sa[x].getBuseo()+"\t"+sa[x].getSabun()+"\t");
				System.out.print(sa[x].getName()+"\t"+sa[x].getPay()+"\n");
				
			}	
			payTotal +=  sa[x].getPay();
		}
		System.out.println("�հ�\t\t\t"+total);
		System.out.println("�� �հ�\t\t\t"+(payTotal+sa[0].getPay()));
		
		

		
		
		
		
		
		
		
	}
	
	
}
