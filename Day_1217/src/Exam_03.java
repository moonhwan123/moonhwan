
public class Exam_03 {
	
	public static void main(String[] args) {
		
		int number = 10;
		char name = 'k';
		int kor = 95;
		int eng = 88 , mat = 77;
		
		int total = kor + eng + mat; // ����
		double average = total / 3.; // ���  (3�ڿ� . �ְ� ������ ���� ����)
		
		
		System.out.println("��ȣ = " + number);
		System.out.println("�̸� = " + name);
		System.out.println("���� = " + total);
		System.out.println("��� = " + average);
		System.out.println();
		
		System.out.print("��ȣ\t�̸�\t����\t����\t����\t����\t���\n");
		System.out.print(number+"\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+total+"\t"+average+"\t"+"\n");
		
		
		
	}

}
