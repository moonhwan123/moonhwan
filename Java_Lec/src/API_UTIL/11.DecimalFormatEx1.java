package API_UTIL;

import java.text.*;


/*
����ȭ Ŭ����
	DecimailFormat
		-���ڸ� �پ��� ����(����)���� ��� �����ϰ� ��
		
*/
class DecimalFormatEx1 {
	
	
	public static void main(String[] args) throws Exception {
		
		double number  = 1234567.89;

		String[] pattern = {
			"0",//10����(���� ���� �� 0)
			"#",//10����
			"0.0",//�Ҽ���0
			"#.#",
			"0000000000.0000",
			"##########.####",
			"#.#-",//������ȣ
			"-#.#",
			"#,###.##",//���� ������
			"#,####.##",
			"#E0",//���� ��ȣ
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
			"#,###.##+;#,###.##-",//;���ϱ�����(�ΰ� �� �ϳ� Ex)����϶� ������ ��)
			"#.#%",
			"#.#\u2030",//�۹�(�ۼ�Ʈ x10)
			"\u00A4 #,###",//��ȭ
			"'#'#,###",//�̽������� ����
			"''#,###",
			

		};
		
		for(int i=0; i < pattern.length; i++) {
		    DecimalFormat df = new DecimalFormat(pattern[i]);
		    System.out.printf("%19s : %s\n",pattern[i], df.format(number));
		}
	} // main
}
