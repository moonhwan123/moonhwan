import java.util.Scanner;

/*
Ű����� ��ȣ,�̸�,����,����,���� �Է�
������ ���� ����ϴ� Ŭ������ �ۼ��Ͻÿ�

[�Է� ����]
�Է� : 1 ȫ�浿  90 70 80

[��� ����]
��ȣ : xx
�̸� : xx
���� : xx
��� : xx
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
		System.out.println("��ȣ : " + this.number);
		System.out.println("�̸� : " + this.name);
		System.out.println("���� : " + tot());
		System.out.println("��� : " + ave());
	}
}




public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�Է� �۾�
		System.out.print("�Է� : ");
		int b = sc.nextInt();
		String na = sc.next();
		int k = sc.nextInt();
		int e = sc.nextInt();
		int m = sc.nextInt();
		//��ü ����
		Student st = new Student(b,na,k,e,m);
		st.print();
		
		
		
		
		
		
		
		sc.close();
	}
}
