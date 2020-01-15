
public class HakData {
	Hak[] hak;
	
	HakData(){}
	HakData(Hak[] hak){
		this.hak = hak;
	}
	
	void print() {
		for(int x = 0; x < hak.length; x++) {
			System.out.print(hak[x].bun+"\t"+hak[x].name+"\t"+hak[x].score+"\n");
//			hak[x].print();
		}
	}
	
}
