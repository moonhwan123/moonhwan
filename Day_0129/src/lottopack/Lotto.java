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
			//여기서 중복 체크(for문 이용)
			for(int y = 0; y < i; y++) { // x=0일때는 작동안함
				if(dangLotto[i] == dangLotto[y]) {
					i--;
					break;
				}
			}
		}
		
	}
	
	void makeBun(){ // 번호 만들기 메서드
		int lotto[] = new int[7];
		for(int a = 0; a < gameCnt; a++ ) {
			for(int i = 0; i < lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45+1);
				//여기서 중복 체크(for문 이용)
				for(int y = 0; y < i; y++) { // x=0일때는 작동안함
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
	}//번호 만들기 메서드 끝
	
	void dangPrint() {
		System.out.println("[당회 당첨 번호]");
		for(int x = 0 ; x < 6; x++) {
			System.out.print(dangLotto[x]+"\t");
		}
		System.out.println("---- 보너스 : "+dangLotto[6]);
	}
	
	

}
