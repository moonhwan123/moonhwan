/*
[�л� Ŭ���� ����]
�ᱹ Ŭ������ "����� ���Ǻ���(�ڷ���)"
 */

class Student{
	int studentNumber;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave; // ���� ���� �Ӽ� ����
	
	void totAccount() { // ���� ���� �޼���
		tot = kor+eng+mat;
	}
	void aveAccount() { // ��� ���� �޼���
		ave = tot /3.;
	}
	void dataPrint() {
		System.out.println("[����ǥ]");
		System.out.print("�й�\t�̸�\t����\t����\t����\t����\t���");
		System.out.println();
		System.out.print(studentNumber+"\t"+name+"\t"+kor+"\t");
		System.out.print(eng+"\t"+mat+"\t"+tot+"\t");
		System.out.println(ave);
	}
	
}

public class Exam_01 {
	public static void main(String[] args) {
		
		Student stu1; // stu1 = "���۷��� ����" (�ν��Ͻ� ����-��ü�� ����Ű�� ����)
		stu1 = new Student(); // �ν��Ͻ� ����(������ ����) , �ؾ Ʋ���� �ؾ�� ���� ����
		//stu1�� �����ϸ� ��ü�� ��������� stu1�� Student�� ����Ų��.
		//�迭�ϰ� ���� ����
		stu1.studentNumber = 1101;
		//stu1.stu1�� ����Ű�� ��
		stu1.name = "ȫ�浿";
		stu1.kor = 90;
		stu1.eng = 80;
		stu1.mat = 70;
		
		stu1.totAccount();
		stu1.aveAccount();
		stu1.dataPrint();
		
		
		
		Student stu2 = new Student(); // ����� ������ ���ÿ� ����
		stu2.dataPrint();
		
		
		
		String str; 
		str="aaa";
		int a; // ���� 
		a= 10;
		
	
		
		
	}
}

