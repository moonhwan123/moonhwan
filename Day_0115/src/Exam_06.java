import java.util.Scanner;

public class Exam_06 { // 메인이 들어가 있는 클래스 -> 실행 클래스
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Hak[] stu = new Hak[5];
		
/*		
		Hak h2 = new Hak(1,"홍길동",90);
		stu[0] = h2; // 객체를 생성해서 넘김
		h2 = new Hak (2,"aaa",80);
		stu[1] = h2; 
		stu[2] = new Hak(3,"ddd",30);
		stu[3] = new Hak(4,"fff",60);
		stu[4] = new Hak(5,"kkk",10);
*/
		Hak hak;
		
		for(int x = 0; x < stu.length; x++) {
			hak = new Hak();
			hak.bun = sc.nextInt();
			hak.name = sc.next();
			hak.score=sc.nextInt();
			stu[x] = hak;
			
		}

		
		HakData class1 = new HakData(stu);
		class1.print();
			
	}
}
