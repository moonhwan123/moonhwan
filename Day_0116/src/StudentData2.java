
public class StudentData2 {
	Student[] arr;
	int cnt;
	
	StudentData2(){
		
	}
	StudentData2(Student[] arr, int cnt){
		this.arr=arr;
		this.cnt=cnt;
	}
	
	void rankAcc() {
		for(int x = 0; x < cnt ; x++) {
			for(int y = 0; y < cnt; y++) {
				if(arr[x].tot<arr[y].tot) {
					arr[x].rank++;
				}
			}
		}
		
	}
	void sort2() {
		for(int x = 0; x < cnt-1 ; x++) {
			for(int y = x+1; y < cnt; y++) {
				if(arr[x].rank > arr[y].rank) {
					Student temp = arr[x]; 
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
		}
	}
	
	void clsDataPrint() {
		System.out.print("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차\n");
		for(int x = 0; x < cnt; x++) {
			arr[x].print();
			
		}
	}
	
	
	
}
