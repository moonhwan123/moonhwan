package API_UTIL;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

public class NewTimeEx1 {
	public static void main(String[] args) {
		/*
		 java.time ��Ű��
		 	-date,Calendar�� ���� ������ ���� �߰��� ��Ű��
		 	
			
		LocalDate
			-��¥
		LocalTime
			-�ð�
		LocalDateTime
			-��¥ & �ð�
		LocalDateTime + �ð��� = ZoneDateTime
		
		Period
			-��¥�� ����
		Duration
			-�ð��� ����
		
		Ư�� �ʵ��� �� �������� - get(),getXXX()
		���� : Calendar 1�� -> 0 �Ͽ��� -> 1
		getXXX() �� 1~12 ������ 1
		
		�޼��� : getYear(),getMonthValue(),getHour()....
		�Ű����� : YEAR,MONTH_OF_YEAR...
		
		�ʵ� �� ����
		with() : ���� �� ����
		plus(),minus(): ���ϱ� ����
		
		
		��¥�� �ð��� ��
		isAfter()
		isBefore()
		isEqual()
		
		 */
		
		LocalDate today = LocalDate.now();
		LocalTime now = LocalTime.now();
		//now() : ���� ��¥ �ð�
		

		
		
		LocalDate birthdate = LocalDate.of(1999, 12, 31);
		LocalTime birthtime = LocalTime.of(23, 59,59);
		//of() : Ư�� ��¥ �ð� ����
		
		birthdate = LocalDate.ofYearDay(1999, 365);
		birthtime = LocalTime.ofSecondOfDay(86399);
		birthdate = LocalDate.parse("1999-12-31");
		birthtime = LocalTime.parse("23:59:59");
		
		System.out.println("today = "+today);
		System.out.println("now = "+now);
		System.out.println("birthdate = "+birthdate);
		System.out.println("birthtime = "+birthtime);
		
		//minus,plus
		LocalDate Id = LocalDate.now();
		System.out.println(Id);
		LocalDate Id2 = Id.minusYears(2).plusMonths(1).minusDays(4);
		System.out.println(Id2);
		LocalDate Id3 = Id.plusWeeks(3);
		System.out.println(Id3);
		LocalDate new_id = Id.withYear(1999).withMonth(8).withDayOfYear(23);
		System.out.println(new_id);
		
		
		int count = 0;
		
		for(int i = 1900; i< 2100; i++) {
			new_id = Id.withYear(i);
			
			if(new_id.isLeapYear()) {
				System.out.println(new_id.getYear()+"�� �����Դϴ�.");
				count++;
			}
		
		}
		System.out.println("1900����� 2100����� ������ �� "+count+"�� �ֽ��ϴ�.");
		
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDateTime new_ldt;    
		new_ldt = ldt.with(TemporalAdjusters.firstDayOfYear( ));  
		System.out.println("������ ù ��° ��"+new_ldt);  
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfYear( ));  
		System.out.println("������ ������ ��"+new_ldt);
		 
		new_ldt = ldt.with(TemporalAdjusters.firstDayOfMonth( ));  
		  
		System.out.println("�̹� ���� ù��° ��"+new_ldt);  
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfMonth( ));  
		System.out.println("�̹����� ������ ��"+new_ldt);
		
		new_ldt = ldt.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));  
		System.out.println("�̹����� ù ������"+new_ldt);  
		new_ldt = ldt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
		System.out.println("�̹����� ������ �Ͽ���"+new_ldt);  
		new_ldt = ldt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));  
		System.out.println("���ƿ��� �ݿ���"+new_ldt);  
		new_ldt = ldt.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));  
		System.out.println("������ ������ ���� �ݿ���"+new_ldt);  
		new_ldt = ldt.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));  
		System.out.println("���� ������"+new_ldt);  
		new_ldt = ldt.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));  
		System.out.println("������ ������ ���� ������"+new_ldt); 
		
		LocalDateTime ldt1 = LocalDateTime.of(2010,1,1,12,23,23,444);
		System.out.println(ldt1);
		
		LocalDateTime ldt2 = LocalDateTime.of(2010,12,25,1,12,2,222);
		System.out.println(ldt2);
		
		System.out.println(ldt1.isAfter(ldt2));//ldt1�� ldt2���� ������ ��¥�ΰ�?
		System.out.println(ldt1.isBefore(ldt2));//ldt1�� ldt2���� ������ ��¥�ΰ�?
		System.out.println(ldt1.isEqual(ldt2));
		
		
		LocalDateTime idt = LocalDateTime.now();
		
		System.out.println(idt);
		
		LocalDateTime end_time = LocalDateTime.of(2017, 6,24,12,00);
		
		System.out.println("�������  : "+end_time);
		
		if(idt.isAfter(end_time)) {
			System.out.println("��������� �������ϴ�.");
		}
		else {
			System.out.println("������� �� ����");
		}
	}
}















