class Hak{
	int bun;
	String name;
	int[] score;
	
	Hak(){}
	Hak(int bun, String name,int[] score){
		this.bun = bun;
		this.name = name;
		this.score = score;
	}
}

class HakData{
	Hak[] hak;
	
	HakData(){}
	HakData(Hak hak[]){
		this.hak = hak;
	}
	void Hakprint() {
		System.out.println("번호\t이름\t점수");
		for(int x = 0; x < hak.length; x++) {
			System.out.print(hak[x].bun+"\t"+hak[x].name+"\t");
			for(int y = 0; y < hak[x].score.length; y++) {
				System.out.print(hak[x].score[y]+" ");
			}
			System.out.println();
		}
	}
	
	void sort() {
		for(int x = 0; x < hak.length; x++) {
			for(int y = 0; y < hak[x].score.length-1; y++) {
				for(int z = y+1; z < hak[x].score.length; z++) {
					if(hak[x].score[y]>hak[x].score[z]) {
						int temp = hak[x].score[y];
						hak[x].score[y] = hak[x].score[z];
						hak[x].score[z] = temp;
					}
				}
			}
		}
	}
	
	
}

/*
출력
번호    이름     점수
1   홍길동  77 88 87 95 75
 */

public class Exam08 {
	public static void main(String[] args) {
		
		Hak[] hak = new Hak[5];
		hak[0] = new Hak(1,"AAA",new int[] {90,87,95,80,77});
		hak[1] = new Hak(2,"BBB",new int[] {60,87,25,60,97});
		hak[2] = new Hak(3,"CCC",new int[] {90,27,65,70,72});
		hak[3] = new Hak(4,"DDD",new int[] {10,37,96,20,68});
		hak[4] = new Hak(5,"EEE",new int[] {50,87,45,23,47});
		
		HakData hd = new HakData(hak);
		hd.sort();
		hd.Hakprint();
		
		
		
		
		
		
		
		
	}
}
