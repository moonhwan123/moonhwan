package studnet;

public class HakExam {
	public static void main(String[] args) {
		
		Hak h = new Hak();
		h.setBun(1);
		h.setName("홍길동");
		h.setKor(90);
		h.setEng(80);
		h.setMat(70);
		
		System.out.println("번호 : " + h.getBun());
		System.out.println("이름 : " + h.getName());
		System.out.println("국어 : " + h.getKor());
		System.out.println("영어 : " + h.getEng());
		System.out.println("수학 : " + h.getMat());
		
		
		
	}
}
