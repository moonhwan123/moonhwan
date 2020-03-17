package sample.action.guest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sample.action.Action;
import sample.model.guest.GuestDAO;
import sample.model.guest.GuestVO;

public class GuestModifyAction implements Action {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		int page = 1;
		if(request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		System.out.println("게스트 모디파이액션에서 받은 페이지값 : "+page);
		GuestDAO dao = GuestDAO.getInstance();
		
		GuestVO vo = dao.guestSelect(idx);
		
		request.setAttribute("vo", vo);
		request.setAttribute("page", page);
		RequestDispatcher dis = request.getRequestDispatcher("Guest/guest_modify.jsp");
		dis.forward(request, response);
		
	}
}
