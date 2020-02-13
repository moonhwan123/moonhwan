package student;

public class School {
	Student stu[];
	int cnt;
	int tot;
	int ave;
	
	School(){
		
	}
	School(Student[] stu,int cnt){
		this.stu = stu;
		this.cnt = cnt;
		
		for(int x = 0; x < cnt ; x++) {
			stu[x].tot += stu[x].kor + stu[x].eng + stu[x].mat;
		}
		
		
		
	}
	
	void rank() {
		for(int x = 0; x < cnt; x++) {
			for(int y = 0; y < cnt; y++) {
				if(stu[x].tot < stu[y].tot) {
					stu[x].rank = stu[x].rank + 1;
				}
			}
		}
	}
	
	void print() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
		for(int x = 0 ; x < cnt; x++) {
			System.out.println(stu[x]);
		}
	}
	
	void ave() {
		for(int x = 0 ; x < cnt; x++) {
			stu[x].ave =(int)(stu[x].tot/3.*100+0.5)/100.;
		}
	}
	
	void sort() {
		for(int x = 0 ; x < cnt-1; x++) {
			for(int y = x+1; y < cnt; y++) {
				if(stu[x].rank > stu[y].rank) {
					int temp = stu[x].rank;
					stu[x].rank = stu[y].rank;
					stu[y].rank = temp;
				}
			}
		}
		
	}

}

