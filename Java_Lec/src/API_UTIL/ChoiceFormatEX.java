package API_UTIL;

import java.text.ChoiceFormat;

// ChoiceFormat - ������ ����ȭ
// : Ư�� ������ ���ϴ� ���� ���ڿ��� ��ȯ
// : if�� switch������ ó���ϱ� ������ ��� ���
// : ���� ������ # -> ��谪 ���� , <�� �������� ����

public class ChoiceFormatEX {

	public static void main(String[] args) {
		
		
		double limits[] = {60,70,80,90};
		String grades[] = {"D","C","B","A"};
		
		String pattern = "60#D|70#C|80<B|90#A";
		
		int scores[] = {100,98,88,70,52,60,70};
		
		ChoiceFormat form = new ChoiceFormat(limits,grades);
		ChoiceFormat form1 = new ChoiceFormat(pattern);
		
		for(int i = 0 ; i < scores.length; i++) {
			System.out.println(scores[i]+" : "+ form.format(scores[i]));
		}
		
		System.out.println();
		
		for(int i = 0 ; i < scores.length; i++) {
			System.out.println(scores[i]+" : "+ form1.format(scores[i]));
		}

	}

}
