package aaaa;

class AA{
	int bun;
	int[] score;
	
	AA(){
		
	}
	AA(int bun,int[]score){
		this.bun = bun;
		this.score = score;
	}
}

class AAData{
	AA[] AAarr;
	
	AAData(){}
	AAData(AA[] AAarr){
		this.AAarr = AAarr;
	}
	//메소드 추가
	//원본 그대로 출력
	void sourceData() {
		System.out.println("번호\t점수");
		for(int x = 0; x < AAarr.length; x++) {
			System.out.print(AAarr[x].bun+"\t");
			for(int y = 0; y < AAarr[x].score.length; y++) {
				System.out.print(AAarr[x].score[y]+"\t");
			}
			System.out.println();
		}
	}
	//점수를 소트 해서 출력
	void sortData() {	
		for(int x = 0; x < AAarr.length; x++) {
			for(int y = 0; y < AAarr[x].score.length-1; y++) {
				for(int z = y+1; z < AAarr[x].score.length; z++) {
					if(AAarr[x].score[y] > AAarr[x].score[z]) {
						int temp = AAarr[x].score[y];
						AAarr[x].score[y] = AAarr[x].score[z];
						AAarr[x].score[z] = temp;
					}
				}
			}
		}
		sourceData();
	}
	
	
	
}

public class Exam04 {
	public static void main(String[] args) {
		
		AA[] AAarr = new AA[5];
		
		AAarr[0] = new AA(4,new int[] {20,30,50,72,45});
		AAarr[1] = new AA(1,new int[] {16,26,70,92,82});
		AAarr[2] = new AA(2,new int[] {59,12,60,77,79});
		AAarr[3] = new AA(5,new int[] {40,21,95,72,92});
		AAarr[4] = new AA(3,new int[] {29,89,24,88,99});
		
		AAData ad = new AAData(AAarr);
		
		ad.sourceData();

		ad.sortData();
		
		
	}
}

