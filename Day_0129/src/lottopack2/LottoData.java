package lottopack2;

import java.util.Arrays;

public class LottoData {
	Lotto[] ltArr;
	int gameCnt;
	String rank;
	static int[] dangLotto = new int[7];

	LottoData() {
	}

	LottoData(Lotto[] ltArr, int gameCnt) {
		this.ltArr = ltArr;
		this.gameCnt = gameCnt;

		for (int i = 0; i < dangLotto.length; i++) { // 당첨번호 생성
			dangLotto[i] = (int) (Math.random() * 45 + 1);
			for (int y = 0; y < i; y++) {
				if (dangLotto[i] == dangLotto[y]) {
					i--;
					break;
				}
			}
		}

	}// 생성자 끝

	void dangCheck() { // 회차별로 등수 체크
		int dangCnt = 0;
		for (int x = 0; x < gameCnt; x++) {
			for (int y = 0; y < 6; y++) {
				for (int v = 0; v < 6; v++) {
					if (ltArr[x].lotto[y] == dangLotto[v]) {
						dangCnt++;
					}
				}
			}
			if (dangCnt == 6) {
				rank = "1등";
			} else if (dangCnt == 5) {
				rank = "3등";
				for (int z = 0; z < 6; z++) {
					if (ltArr[x].lotto[z] == dangLotto[6]) {
						rank = "2등";
						break;
					}
				}
			} else if (dangCnt == 4) {
				rank = "4등";
			} else if (dangCnt == 3) {
				rank = "5등";
			} else {
				rank = "꽝";
			}
			System.out.println((x + 1) + "회차는 " + rank + " 입니다.");
			dangCnt = 0;
		}

	}

	void dangPrint() {
		for (int x = 0; x < 5; x++) {
			for (int y = x + 1; y < 6; y++) {
				if (dangLotto[x] > dangLotto[y]) {
					int temp = dangLotto[x];
					dangLotto[x] = dangLotto[y];
					dangLotto[y] = temp;
				}
			}
		}
		System.out.println("[당회 당첨 번호]");
		for (int x = 0; x < 6; x++) {
			System.out.print(dangLotto[x] + "\t");
		}
		System.out.println("---- 보너스 : " + dangLotto[6]);
	}

}
