package student;

public class Student {
	int bun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;
	int rank=1;
	
	Student(){
		
	}
	Student(int bun, String name,int kor,int eng,int mat){
		this.bun = bun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.bun+"\t"+this.name+"\t"+this.kor+"\t"+this.eng+"\t"+this.mat+"\t"+this.tot+"\t"+this.ave+"\t"
				+this.rank+"\t";
	}

}
