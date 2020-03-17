package sample.action.guest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sample.action.Action;
import sample.model.guest.GuestDAO;
import sample.model.guest.GuestVO;

public class GuestModifyProAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GuestDAO dao = GuestDAO.getInstance();
		GuestVO vo = new GuestVO();
		int page = 1;
		if(request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		vo.setSubject(request.getParameter("subject"));
		vo.setContents(request.getParameter("contents"));
		vo.setIdx(Integer.parseInt(request.getParameter("idx")));
		int row = dao.guestModify(vo);
		request.setAttribute("row", row);
		request.setAttribute("page", page);
		RequestDispatcher dis = request.getRequestDispatcher("Guest?command=guest_list");
		dis.forward(request, response);
		

	}

}
