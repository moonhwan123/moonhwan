import java.util.Calendar;

/*
Calender
���� 0-11
���� (1~7) 1 : �Ͽ���
YEAR,MONTH,DATE ��,��,��
HOUR,MINUTE,SECNOD ��,��,�� , AM_PM
DAY_OF_WEEK 

 */
public class Exam_02 {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); //new ��� �Ұ�
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; //0~11��
		int day = cal.get(Calendar.DATE);
		
		System.out.println(year+"-"+month+"-"+day);
		
	}
}
