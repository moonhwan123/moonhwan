import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
1. ���� ��¥
Date now = new Data();
1.8 ���Ŀ��� ��밡��

 */
public class Exam_10 {
	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		
		LocalTime time = LocalTime.now();
		
		LocalDateTime today = LocalDateTime.now();
		
		System.out.println("��¥ : "+now);
		System.out.println("�ð� : "+time);
		System.out.println("��¥/�ð� : "+today);
		
		
	}
}
