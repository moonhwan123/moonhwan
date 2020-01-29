package lottopack;

public class Lotto {
	int gameCnt;
	int lotto[] = new int[6];
	static int[] dangLotto = new int[7];
	
	int cnt=0;
	
	Lotto(){}
	Lotto(int gameCnt){
		this.gameCnt = gameCnt;
		
		for(int i = 0; i < dangLotto.length; i++) {
			dangLotto[i] = (int)(Math.random()*45+1);
			//���⼭ �ߺ� üũ(for�� �̿�)
			for(int y = 0; y < i; y++) { // x=0�϶��� �۵�����
				if(dangLotto[i] == dangLotto[y]) {
					i--;
					break;
				}
			}
		}
		
	}
	
	void makeBun(){ // ��ȣ ����� �޼���
		int lotto[] = new int[7];
		for(int a = 0; a < gameCnt; a++ ) {
			for(int i = 0; i < lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45+1);
				//���⼭ �ߺ� üũ(for�� �̿�)
				for(int y = 0; y < i; y++) { // x=0�϶��� �۵�����
					if(lotto[i] == lotto[y]) {
						i--;
						break;
					}
				}
			}
			
			
			
			
			System.out.print((a+1)+")\t");
			for(int x = 0 ; x < 6; x++) {
				System.out.print(lotto[x]+"\t");
			}
			System.out.println();
		}
	}//��ȣ ����� �޼��� ��
	
	void dangPrint() {
		System.out.println("[��ȸ ��÷ ��ȣ]");
		for(int x = 0 ; x < 6; x++) {
			System.out.print(dangLotto[x]+"\t");
		}
		System.out.println("---- ���ʽ� : "+dangLotto[6]);
	}
	
	

}
