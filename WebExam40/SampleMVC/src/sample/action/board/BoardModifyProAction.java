package sample.action.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sample.action.Action;
import sample.model.board.BoardDAO;
import sample.model.board.BoardVO;

public class BoardModifyProAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		BoardVO vo = new BoardVO();
		
		int page = 1;
		if(request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		vo.setIdx(Integer.parseInt(request.getParameter("idx")));
		vo.setEmail(request.getParameter("email"));
		vo.setSubject(request.getParameter("subject"));
		vo.setContents(request.getParameter("contents"));
		vo.setPass(request.getParameter("pass"));
		
		BoardDAO dao = BoardDAO.getInstance();
		int row = dao.boardModify(vo);
		
		request.setAttribute("row", row);
		request.setAttribute("page", page);
		RequestDispatcher dispater = request.getRequestDispatcher("Board/board_modify_pro.jsp");
		dispater.forward(request, response);
	}

}
