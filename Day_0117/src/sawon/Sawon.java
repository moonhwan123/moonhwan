package sawon;

public class Sawon {
	String id;
	int grade;
	int time;
	double weekpay;
	int timepay;
	int overTime;
	double overTp;
	
	Sawon(){};
	Sawon(String id,int grade,int time){
		this.id = id;
		this.grade = grade;
		this.time = time;
		
		
		if(grade == 1) {
			timepay = 10000;
		}else if(grade == 2) {
			timepay = 5000;
		}else {
			timepay = 2000;
		}
		
		if(time > 36) {
			overTime = time-36; 
			overTp = timepay * 1.5;
		}
		
		weekpay = (36*timepay)+(overTime*overTp);
		
	}
	
	void sawonPrint() {
		System.out.print(id+"\t"+grade+"\t"+timepay+"\t"+time+"\t"+weekpay+"\n");
	}
	
}
