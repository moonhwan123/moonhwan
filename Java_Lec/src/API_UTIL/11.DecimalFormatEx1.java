package API_UTIL;

import java.text.*;


/*
형식화 클래스
	DecimailFormat
		-숫자를 다양한 형식(패턴)으로 출력 가능하게 함
		
*/
class DecimalFormatEx1 {
	
	
	public static void main(String[] args) throws Exception {
		
		double number  = 1234567.89;

		String[] pattern = {
			"0",//10진수(값이 없을 때 0)
			"#",//10진수
			"0.0",//소수점0
			"#.#",
			"0000000000.0000",
			"##########.####",
			"#.#-",//음수부호
			"-#.#",
			"#,###.##",//단위 구분자
			"#,####.##",
			"#E0",//지수 기호
			"0E0",
			"##E0",
			"00E0",
			"####E0",
			"0000E0",
			"#.#E0",
			"0.0E0",
			"0.000000000E0",
			"00.00000000E0",
			"000.0000000E0",
			"#.#########E0",
			"##.########E0",
			"###.#######E0",
			"#,###.##+;#,###.##-",//;패턴구분자(두개 중 하나 Ex)양수일때 음수일 때)
			"#.#%",
			"#.#\u2030",//퍼밀(퍼센트 x10)
			"\u00A4 #,###",//통화
			"'#'#,###",//이스케이프 문자
			"''#,###",
			

		};
		
		for(int i=0; i < pattern.length; i++) {
		    DecimalFormat df = new DecimalFormat(pattern[i]);
		    System.out.printf("%19s : %s\n",pattern[i], df.format(number));
		}
	} // main
}
