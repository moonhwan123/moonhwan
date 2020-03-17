package sample.action.guest;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sample.action.Action;
import sample.model.guest.GuestDAO;
import sample.model.guest.GuestVO;
import sample.util.PageIndex;

public class GuestListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		GuestDAO dao = GuestDAO.getInstance();
		int totcount = dao.guestCount();
		int nowpage = 1;
		int maxlist = 10;
		int totpage = 1;
		
		if(totcount%maxlist == 0) {
			totpage = totcount/maxlist;
		}else {
			totpage = totcount/maxlist + 1;
		}
		
		if(request.getParameter("page") != null) {
			nowpage = Integer.parseInt(request.getParameter("page"));
		}
		int page_start = (nowpage - 1) * maxlist;
		int page_end = nowpage * maxlist;
		int listcount = totcount - ((nowpage - 1) * maxlist);
		
		List<GuestVO> list = dao.GuestList(page_start, page_end);
		
		String pageSkip = PageIndex.pageList(nowpage, totpage, "Guest?command=guest_list","");
		
		request.setAttribute("totcount", totcount);
		request.setAttribute("list", list); // 게시글 목록
		request.setAttribute("listcount", listcount); // 페이지 수
		request.setAttribute("page", nowpage);
		request.setAttribute("totpage", totpage);
		request.setAttribute("pageSkip", pageSkip);
		
		RequestDispatcher dis = request.getRequestDispatcher("Guest/guest_list.jsp");
		dis.forward(request, response);
		
	}

}
