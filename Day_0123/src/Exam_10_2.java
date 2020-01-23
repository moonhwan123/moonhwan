import java.util.Arrays;
import java.util.Scanner;

/*

Ű����� ���� �� �Է�
���Ӽ� : 5

1 : 19 20 34 35 40 43
.
.
5 : 1 10 17 34 38 40

[ó�� ����]
1���Ӵ� �������� 100���� �� �߻� �󵵰� ����
6���� ���ڸ� �����ؼ� ���
 */

public class Exam_10_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ball[][] = new int[2][45];
		int[] lotto = new int[6];
		int[] lotto2 = new int[6]; // �� ������ Ƚ�� ����� �迭

		// ball �迭 �ʱ�ȭ
		for (int x = 0; x < ball[0].length; x++) {
			ball[0][x] += x + 1; // 1���� 45���� ����
		}

		System.out.print("�ݺ� Ƚ�� : ");
		int banbok = sc.nextInt();

		// �ݺ� ����
		for (int o = 0; o < banbok; o++) {
			// ���� 100�� ����
			for (int x = 0; x < 100; x++) {
				for (int i = 0; i < lotto.length; i++) {
					int number = (int) (Math.random() * 45 + 1);
					lotto[i] = number;
					for (int y = 0; y < i; y++) { 
						if (lotto[i] == lotto[y]) {
							i--;
							break;
						}
					}
					ball[1][number - 1]++; // ���� ī��Ʈ
				}
			} // 100�� ���� �ٵ���

			// ball �迭 ���� (�󵵼� ���� ����,���� TOP6���ϱ�)
			for (int x = 0; x < ball[0].length - 1; x++) {
				for (int y = x + 1; y < ball[0].length; y++) {
					if (ball[1][x] < ball[1][y]) { // �󵵼��� �������� ���ڸ� ����
						int temp = ball[1][x];
						ball[1][x] = ball[1][y];
						ball[1][y] = temp;

						temp = ball[0][x];
						ball[0][x] = ball[0][y];
						ball[0][y] = temp;
					}
				}
			} // ���ĳ�

			// ball[0][0~5]������ ���� lotto[0~5]�� �̵� �� �������� ����
			for (int a = 0; a < 6; a++) {
				lotto[a] = ball[0][a];
				lotto2[a] = ball[1][a];
				for (int x = 0; x < lotto.length - 1; x++) {
					for (int y = x + 1; y < lotto.length; y++) {
						if (lotto[x] > lotto[y]) { 
							int temp = lotto[x];
							lotto[x] = lotto[y];
							lotto[y] = temp;
						}
					}
				}
			}
			// lotto�迭 ���
			System.out.print((o + 1) + "ȸ)\t");
			for (int a = 0; a < 6; a++) {
				System.out.print(lotto[a] + "\t");
			}
			System.out.println();
			// �� ������ Ƚ�� ���
			for (int a = 0; a < 6; a++) {
				System.out.print("\t"+lotto2[a] + "ȸ");
			}
			//���� ���� �ʱ�ȭ
			for (int x = 0; x < ball[0].length; x++) {
				ball[1][x] = 0; // 1���� 45���� ����
			}
			System.out.println();
			
			
			
		} // ��ü for�� ��

	}

}
