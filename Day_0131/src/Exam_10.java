import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
1. 현재 날짜
Date now = new Data();
1.8 이후에서 사용가능

 */
public class Exam_10 {
	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		
		LocalTime time = LocalTime.now();
		
		LocalDateTime today = LocalDateTime.now();
		
		System.out.println("날짜 : "+now);
		System.out.println("시간 : "+time);
		System.out.println("날짜/시간 : "+today);
		
		
	}
}
