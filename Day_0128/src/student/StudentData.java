package student;

public class StudentData {
	Student[] stuArr;
	String dap;
	double hwakArr[] = new double[20];
	
	static String dapArr[];
	
	
	public StudentData() {}
	public StudentData(Student[] stuArr,String dap) {
		this.stuArr = stuArr;
		this.dap = dap;
		dapArr = dap.split(",");
		
		for(int x = 0; x < stuArr.length; x++) {
			for(int y = 0 ; y < 20; y++) {
				if(stuArr[x].arr[y].equals(dapArr[y])) {
					stuArr[x].daparr[y] = "o";
					stuArr[x].dapcnt++;
				}else {
					stuArr[x].daparr[y] = "x";
				}
			}
		}
		
		
	}
	
//	public void check() {
//		for(int x = 0; x < stuArr.length; x++) {
//			for(int y = 0 ; y < 20; y++) {
//				if(stuArr[x].arr[y].equals(dapArr[y])) {
//					stuArr[x].daparr[y] = "o";
//					stuArr[x].dapcnt++;
//				}else {
//					stuArr[x].daparr[y] = "x";
//				}
//			}
//		}
//		
//	}
	
	public void print() {
		System.out.println("번호\t이름\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12\t13\t14\t15\t16\t17\t18\t19\t20\t점수");
		for(int x = 0 ; x < 20; x++) {
			System.out.print(stuArr[x].bun+"\t"+stuArr[x].name+"\t");
			for(int y = 0 ; y < 20; y++) {
				System.out.print(stuArr[x].daparr[y]+"\t");
			}
			stuArr[x].score = stuArr[x].dapcnt*5;
			System.out.println(stuArr[x].score);
		}
		
		

	}
	
	
	public void rate1() {
		double imsi=0;
		double hwak;
		for(int x = 0; x < 20; x++) {
			imsi=0;
			for(int y = 0; y < 20; y++) {
				if(stuArr[y].daparr[x].equals("o")) {
					imsi++;
				}
			}
			hwakArr[x] = (imsi/20)*100;
			
		}
		System.out.print("             ");
		for(int x = 0; x < 20; x++) {
			System.out.print(hwakArr[x]+"%"+" \t");
		}
	}
	
	
	

}
