import java.util.Scanner;

/*
1.[�Է� ����]
����� : ȫ�浿
����    : 5
��       : 20

2.[��� ����]
����� : ȫ�浿
������ : 5+6+7+8+....+20 = xxx

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
		System.out.println("����� : "+this.name);
		System.out.print("���� ��� : ");
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
		
		//�ۼ�
		System.out.print("����� : ");
		String name = sc.next();
		System.out.print("����    : ");
		int start = sc.nextInt();
		System.out.print("��       : ");
		int end = sc.nextInt();
		
		SeqNumber seq = new SeqNumber(name,start,end);
		
		seq.print();
		
		
		
	}
		
}
