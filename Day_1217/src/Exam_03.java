
public class Exam_03 {
	
	public static void main(String[] args) {
		
		int number = 10;
		char name = 'k';
		int kor = 95;
		int eng = 88 , mat = 77;
		
		int total = kor + eng + mat; // 총점
		double average = total / 3.; // 평균  (3뒤에 . 있고 없고의 차이 숙지)
		
		
		System.out.println("번호 = " + number);
		System.out.println("이름 = " + name);
		System.out.println("총점 = " + total);
		System.out.println("평균 = " + average);
		System.out.println();
		
		System.out.print("번호\t이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.print(number+"\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+total+"\t"+average+"\t"+"\n");
		
		
		
	}

}
