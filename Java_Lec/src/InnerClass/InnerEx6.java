package InnerClass;

import java.awt.Button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class InnerEx6  {
	
	Object iv = new Object() {
		void method() {}
	};
	
	
	static Object cv = new Object() {
		void method() {}
	};
	
	
	void myMethod() {
		Object lv = new Object() {
			void method() {}
		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		

	}
	
	
	
class EventHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

}
