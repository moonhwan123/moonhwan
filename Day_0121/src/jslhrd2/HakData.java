package jslhrd2;

public class HakData extends Hak implements Account {
	int total;
	double ave;
	int[] scorearr;
	boolean sw;

	HakData() {

	}

	HakData(int bun, String name, int score) {
		this.bun = bun;
		this.name = name;
		this.score = score;
		total(score);
		sw = true;
		
	}	
	
	HakData(int bun, String name, int[] scorearr) {
		this.bun = bun;
		this.name = name;
		this.scorearr = scorearr;
		total(scorearr);
		sw = false;

	}

	@Override
	public void total(int score) {
		total += score;
		ave = total;
	}

	@Override
	public void total(int[] score) {
		for (int x = 0; x < scorearr.length; x++) {
			total += scorearr[x];
		}
		ave = total / scorearr.length;

	}

	void print() {
		if (sw) {
			System.out.print("번호\t이름\t점수\t합계\t평균\n");
			System.out.println(bun + "\t" + name + "\t" + score + "\t" + total + "\t" + ave);
		}else {
			System.out.print("번호\t이름\t점수\t\t합계\t평균\n");
			System.out.print(bun + "\t" + name + "\t");
			for(int x = 0; x < scorearr.length; x++) {
				System.out.print(scorearr[x]+" ");
			}
			System.out.print(" ");
			System.out.println(total+"\t"+ave);
		}
	}

}
