package lottopack2;

import java.util.Arrays;

public class Lotto {
	
	int lotto[] = new int[6];
	
	Lotto() {}
	Lotto(int[] lotto){
		this.lotto = lotto.clone(); 
		Arrays.sort(this.lotto);
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for(int x = 0 ; x < lotto.length; x++) {
			sb.append(lotto[x]+"\t");
		}
		
		return sb.toString();
	}

}

