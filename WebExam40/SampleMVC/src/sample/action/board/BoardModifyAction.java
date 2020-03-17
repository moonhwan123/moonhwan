package sample.action.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sample.action.Action;
import sample.model.board.BoardDAO;
import sample.model.board.BoardVO;

public class BoardModifyAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		int page = 1;
		if(request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		BoardDAO dao = BoardDAO.getInstance();
		
		BoardVO vo = dao.boardSelect(idx);
		
		request.setAttribute("vo", vo);
		request.setAttribute("page", page);
		RequestDispatcher dis = request.getRequestDispatcher("Board/board_modify.jsp");
		dis.forward(request, response);

	}

}
