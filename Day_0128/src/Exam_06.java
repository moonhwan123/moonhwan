import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
파일(input.txt)로 학생정보를 입력 받아서
총점 평균을 구하여 출력 
 */



class Hak2{
	int bun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;
	
	public Hak2() {}
	public Hak2(int bun, String name, int kor, int eng, int mat) {
		this.bun = bun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		tot = kor+eng+mat;
		ave = tot/3.;
	}


	@Override
	public String toString() {
		StringBuffer data = new StringBuffer();
		data.append(bun+"\t");
		data.append(name+"\t");
		data.append(kor+"\t");
		data.append(eng+"\t");
		data.append(mat+"\t");
		data.append(tot+"\t");
		data.append(ave+"\n");
		return data.toString();
	}
	
//	@Override
//	public String toString() {
//		return bun+"\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+
//				tot+"\t"+ave+"\n";
//	}
	
	
	
	
	
}


public class Exam_06 {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("c:\\data\\test.txt"));
		Hak2 hak = null;
		StringTokenizer st = null;
		
		while(sc.hasNext()) {
			st = new StringTokenizer(sc.nextLine(),",.");
			int bun = Integer.parseInt((st.nextToken()));
			String name = (st.nextToken());
			int kor = Integer.parseInt((st.nextToken()));
			int eng = Integer.parseInt((st.nextToken()));
			int mat = Integer.parseInt((st.nextToken()));
			
			hak = new Hak2(bun,name,kor,eng,mat);
			
			System.out.print(hak);
		}

		
		
		
		
		
		
	}
}
