package lottopack;

public class LottoData {
	Lotto[] ltArr;
	static int[] dangLotto = new int[7];
	int gameCnt;
	int cnt;
	
	LottoData(){}
	LottoData(Lotto[] ltArr, int gameCnt){
		this.ltArr = ltArr;
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
	
	
	
	
	
	
	
	
	
}
