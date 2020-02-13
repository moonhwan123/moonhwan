package jslhrd;

public class ActionExam {

	public static void main(String[] args) {
		
		
	//	ActionTest action = new ActionTest();
		
	//	action.work();
		
		Action action2 = new Action() {
			
			public void work() {
				System.out.println("[실행결과]");
				System.out.println("복사를 합니다.");
			}
			
		};
		
		action2.work();
		
		
	}
}
