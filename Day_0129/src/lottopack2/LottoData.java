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

		for (int i = 0; i < dangLotto.length; i++) { // ��÷��ȣ ����
			dangLotto[i] = (int) (Math.random() * 45 + 1);
			for (int y = 0; y < i; y++) {
				if (dangLotto[i] == dangLotto[y]) {
					i--;
					break;
				}
			}
		}

	}// ������ ��

	void dangCheck() { // ȸ������ ��� üũ
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
				rank = "1��";
			} else if (dangCnt == 5) {
				rank = "3��";
				for (int z = 0; z < 6; z++) {
					if (ltArr[x].lotto[z] == dangLotto[6]) {
						rank = "2��";
						break;
					}
				}
			} else if (dangCnt == 4) {
				rank = "4��";
			} else if (dangCnt == 3) {
				rank = "5��";
			} else {
				rank = "��";
			}
			System.out.println((x + 1) + "ȸ���� " + rank + " �Դϴ�.");
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
		System.out.println("[��ȸ ��÷ ��ȣ]");
		for (int x = 0; x < 6; x++) {
			System.out.print(dangLotto[x] + "\t");
		}
		System.out.println("---- ���ʽ� : " + dangLotto[6]);
	}

}
