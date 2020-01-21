package aaaa;

import java.util.Scanner;

class Hak{
	int bun;
	String name;
	int[] score;
	int tot;
	
	Hak (){}
	Hak (int bun, String name, int[] score){
		this.bun = bun;
		this.name = name;
		this.score = score;
		totAcc();
	}
	
	void totAcc() {
		for(int x = 0 ; x < score.length; x++) {
			tot += score[x];
		}
	}
	
	void print() {
		System.out.print("번호\t이름\t총점");
		System.out.print(this.bun+"\t"+this.name+"\t"+this.tot);
	}
	
	
}

class HakData{
	Hak[] hak;

	HakData(){}
	HakData(Hak[] hak){
		this.hak = hak;
	}
	
	//총점을 이용한 검색 메소드
	void totSearch(int tot) {
		boolean sw = true;
		for(int x = 0; x < hak.length; x++) {
			if(tot == hak[x].tot) {
				System.out.println("번호 : "+hak[x].bun);
				System.out.println("이름 : "+hak[x].name);
				System.out.print("점수 : ");
				for(int y = 0; y < hak[x].score.length; y++) {
					System.out.print(hak[x].score[y]+"   ");
				}
				System.out.println();
				sw = false;
				continue;
			}
		}
		if(sw) {
			System.out.println(tot+"점은  없는 총점");
		}
		
	}
	//번호를 이용한 검색 메소드
	void bunSearch(int bun) {
		boolean sw = true;
		for(int x = 0; x < hak.length; x++) {
			if(bun == hak[x].bun) {
				System.out.println("번호 : "+hak[x].bun);
				System.out.println("이름 : "+hak[x].name);
				System.out.print("점수 : ");
				for(int y = 0; y < hak[x].score.length; y++) {
					System.out.print(hak[x].score[y]+"   ");
				}
				System.out.println();
				sw = false;
				continue;
			}
		}
		if(sw) {
			System.out.println(bun+"번은 없는 번호");
		}
	}
	
	//총점 출력 메서드
	void print() {
		System.out.println("============================");
		System.out.println("번호\t이름\t총점");
		for(int x = 0; x < hak.length; x++) {
			System.out.print(hak[x].bun+"\t"+hak[x].name+"\t"+hak[x].tot+"\n");
		}
		System.out.println("============================");
	}
	
}


public class Exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Hak[] hak = new Hak[5];
		
		hak[0] = new Hak(1,"AA",new int[] {10,30,50,40,90});
		hak[1] = new Hak(2,"BB",new int[] {32,10,35,60,58});
		hak[2] = new Hak(3,"CC",new int[] {12,60,64,24,70});
		hak[3] = new Hak(4,"DD",new int[] {17,31,20,46,99});
		hak[4] = new Hak(5,"EE",new int[] {64,85,26,92,85});
		
		
		
		HakData hd = new HakData(hak);
		
		
		System.out.print("검색 대상 학생 번호 : ");
		int bun = sc.nextInt();
		hd.bunSearch(bun);
		
		hd.print();
		
		System.out.print("검색 대상 학생 총점 : ");
		int tot = sc.nextInt();
		hd.totSearch(tot);
		
		
		
		

		
	}
}
