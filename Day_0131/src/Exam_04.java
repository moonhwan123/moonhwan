import java.util.Calendar;

public class Exam_04 {
	public static void main(String[] args) {
		
		if(args.length != 2) {
			System.out.println("Usage : java Exam_04 2020 1");
			return;
		}
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		sDay.set(year, month-1, 1);
		eDay.set(year, month-1,sDay.getActualMaximum(Calendar.DATE));
		
		sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("           " + args[0] + "년" + args[1] + "월");
		System.out.println("  SU  MO  TU  WE  TH  FR  SA");
		
		for(int n = 1; sDay.before(eDay)||sDay.equals(eDay)
				; sDay.add(Calendar.DATE,1)) {
			int day = sDay.get(Calendar.DATE);
			System.out.print((day<10)? "   "+day : "  " +day);
			if(n++%7==0)System.out.println();
		}
		
		
	}
}

