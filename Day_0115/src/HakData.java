
public class HakData {
	Hak[] hak;
	
	HakData(){}
	HakData(Hak[] hak){
		this.hak = hak;
	}
	
	void print() {
		for(int x = 0; x < hak.length; x++) {
			hak[x].print();
		}
	}
	
}
