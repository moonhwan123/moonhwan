public class Hak{
	int bun;
	String name;
	int score;
	//생성자 오버로딩
	Hak(){}
	Hak(int bun, String name, int score){
		this.bun = bun;
		this.name = name;
		this.score = score;
	}
	
	//메서드 오버로딩
	void print() { // 멤버 메서드
		System.out.print(bun+"\t"+name+"\t"+score);
		System.out.println();
	}
	void print(int sw) { // 멤버 메서드
		System.out.print(sw+"\t"+bun+"\t"+name+"\t"+score);
	}
}
