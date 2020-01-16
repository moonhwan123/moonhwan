
public class Student {
	int bun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;
	int rank=1;
	
	Student(){}
	Student(int bun, String name, int kor, int eng, int mat){
		this.bun = bun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = kor + eng + mat;
		this.ave = (int)(tot/3.*100+0.5)/100.;
	}
	
	
	
	void print(){
		System.out.print(bun+"\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+ave+"\t"+rank+"\n");
	}
}
