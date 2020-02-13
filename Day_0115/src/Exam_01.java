import java.util.Scanner;

/*
키보드로 번호,이름,국어,영어,수학 입력
다음과 같이 출력하는 클래스를 작성하시오

[입력 예시]
입력 : 1 홍길동  90 70 80

[출력 예시]
번호 : xx
이름 : xx
총점 : xx
평균 : xx
 */

class Student{
	private int number;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	
	Student() {}
	Student(int number,String name ,int kor, int eng , int mat){
		this.number = number;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	private int tot() {
		return kor+eng+mat;
	}
	private double ave() {
		return (int)((tot()/3.)*100+0.5)/100;
	}
	
	void print() {
		System.out.println("번호 : " + this.number);
		System.out.println("이름 : " + this.name);
		System.out.println("총점 : " + tot());
		System.out.println("평균 : " + ave());
	}
}




public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력 작업
		System.out.print("입력 : ");
		int b = sc.nextInt();
		String na = sc.next();
		int k = sc.nextInt();
		int e = sc.nextInt();
		int m = sc.nextInt();
		//객체 생성
		Student st = new Student(b,na,k,e,m);
		st.print();
		
		
		
		
		
		
		
		sc.close();
	}
}
