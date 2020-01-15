import java.util.Scanner;

/*
1.[입력 예시]
사용자 : 홍길동
시작    : 5
끝       : 20

2.[출력 예시]
사용자 : 홍길동
연산결과 : 5+6+7+8+....+20 = xxx

 */

class SeqNumber{
	String name;
	int start;
	int end;
	int sum;
	
	SeqNumber(){
		
	}
	SeqNumber(String name ,int start,int end){
		this.name = name;
		this.start = start;
		this.end = end;
	}
	
	void print() {
		System.out.println("사용자 : "+this.name);
		System.out.print("연산 결과 : ");
		for(int i = start; i <= end; i++) {
			if(i<end) System.out.print(i+" + ");
			else System.out.print(i+" = ");
			sum += i;
		}
		System.out.println(sum);
	}
}



public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//작성
		System.out.print("사용자 : ");
		String name = sc.next();
		System.out.print("시작    : ");
		int start = sc.nextInt();
		System.out.print("끝       : ");
		int end = sc.nextInt();
		
		SeqNumber seq = new SeqNumber(name,start,end);
		
		seq.print();
		
		
		
	}
		
}
