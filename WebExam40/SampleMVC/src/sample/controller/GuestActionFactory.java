package sample.controller;

import sample.action.Action;
import sample.action.guest.*;

public class GuestActionFactory {
	private static GuestActionFactory instance = new GuestActionFactory();
	
	public static GuestActionFactory getinstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory : " + command);
		
		if(command.equals("guest_list")) {
			action = new GuestListAction();
		}else if(command.equals("guest_view")) {
			action = new GuestViewAction();
		}else if(command.equals("guest_write")) { 		// 등록 폼으로 이동
			action = new GuestWriteAction();
		}else if(command.equals("guest_write_pro")) { 	// 실제 등록
			action = new GuestWriteProAction();
		}else if(command.equals("guest_modify")) {
			action = new GuestModifyAction();
		}else if(command.equals("guest_modify_pro")) {
			action = new GuestModifyProAction();
		}else if(command.equals("guest_delete")) {
			action = new GuestDeleteAction();
		}
		return action;
	}
	
}
