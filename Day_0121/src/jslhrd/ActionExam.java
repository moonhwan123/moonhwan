package jslhrd;

public class ActionExam {

	public static void main(String[] args) {
		
		
	//	ActionTest action = new ActionTest();
		
	//	action.work();
		
		Action action2 = new Action() {
			
			public void work() {
				System.out.println("[������]");
				System.out.println("���縦 �մϴ�.");
			}
			
		};
		
		action2.work();
		
		
	}
}
