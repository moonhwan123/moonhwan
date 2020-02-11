
public class StudentData {
	//여기서 클래스 배열 만들어서 처리해도된다.
	//그리고 같이 cnt도 받아서 ㄱㄱ 그럼 메소드에서 안받아도됨 ㅇㅇ
	//그럼 당연히 생성자 로 받아 줘야겠지?
	//그냥 내가한거 처럼 매개변수로 받아도 되고,
	
	
	//굳이 메인에서 호출 안해도 되고, 생성자 내에서 메서드 호출해서 
	//메인에서 출력 하는 방법도 있음.
	
	

	
	
	//석차계산
	void rank(Student[] cls1 ,int cnt) {
		for(int x = 0; x < cnt ; x++) {
			for(int y = 0; y < cnt; y++) {
				if(cls1[x].tot<cls1[y].tot) {
					cls1[x].rank++;
				}
			}
		}
		
	}
	//석차 기준 오름 차순
	void sort(Student[] cls1 ,int cnt) {
		for(int x = 0; x < cnt-1 ; x++) {
			for(int y = x+1; y < cnt; y++) {
				if(cls1[x].rank > cls1[y].rank) {
					Student temp = cls1[x]; 
					cls1[x] = cls1[y];
					cls1[y] = temp;
				}
			}
		}
	}
	
	//데이터 출력
	void clsDataPrint(Student[] cls1,int cnt) {
		System.out.print("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차\n");
		for(int x = 0; x < cnt; x++) {
			cls1[x].print();
			
		}
	}
	
}
