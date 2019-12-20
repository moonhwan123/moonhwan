package API_UTIL;

import java.text.ChoiceFormat;

// ChoiceFormat - 범위의 형식화
// : 특정 범위에 속하는 값을 문자열로 반환
// : if문 switch문으로 처리하기 복잡한 경우 사용
// : 패턴 구분자 # -> 경계값 포함 , <은 포함하지 않음

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
