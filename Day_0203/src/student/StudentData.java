package student;

import java.util.List;

public class StudentData {
	List<Student> stuList;
	
	public StudentData(List<Student> stuList) {
		this.stuList = stuList;
		for(int x = 0 ; x < stuList.size(); x++) {
			for(int y = 0 ; y < stuList.size(); y++) {
				if(stuList.get(x).tot < stuList.get(y).tot) {
					stuList.get(x).rank ++;
				}
			}
		}
	}
	
	private void ranksort() { // 석차순 정렬 메소드
		for(int x = 0 ; x < stuList.size()-1; x++) {
			for(int y = x+1 ; y < stuList.size(); y++) {
				if(stuList.get(x).rank > stuList.get(y).rank) {
					Student tmp = stuList.get(x);
					stuList.set(x, stuList.get(y));
					stuList.set(y, tmp);
				}
			}
		}
	}
	
	public void sourcePrint() {
		System.out.println("[원본 데이터 출력]");
		System.out.println("번호\t이름\t점수1\t점수2\t점수3\t점수4\t점수5\t총점\t평균\t석차");
		for(int x = 0 ; x < stuList.size(); x++) {
			System.out.print(stuList.get(x));
		}
	}
	
	public void sortdataPrint() {
		ranksort();
		System.out.println("[석차순 정렬 후 데이터 출력]");
		System.out.println("번호\t이름\t점수1\t점수2\t점수3\t점수4\t점수5\t총점\t평균\t석차");
		for(int x = 0 ; x < stuList.size(); x++) {
			System.out.print(stuList.get(x));
		}
	}
	
	
	
}
