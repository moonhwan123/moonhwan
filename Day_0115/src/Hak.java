public class Hak{
	int bun;
	String name;
	int score;
	//������ �����ε�
	Hak(){}
	Hak(int bun, String name, int score){
		this.bun = bun;
		this.name = name;
		this.score = score;
	}
	
	//�޼��� �����ε�
	void print() { // ��� �޼���
		System.out.print(bun+"\t"+name+"\t"+score);
		System.out.println();
	}
	void print(int sw) { // ��� �޼���
		System.out.print(sw+"\t"+bun+"\t"+name+"\t"+score);
	}
}
