package sample.action.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sample.action.Action;
import sample.model.board.BoardDAO;

public class BoardDeleteProAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		String pass = request.getParameter("pass");
		System.out.println("idx : "+idx);
		System.out.println(pass);
		
		BoardDAO dao = BoardDAO.getInstance();
		
		int row = dao.boardDelete(idx, pass);
		
		request.setAttribute("row", row);
		
		RequestDispatcher dis = request.getRequestDispatcher("Board/board_delete_pro.jsp");
		dis.forward(request, response);
		

	}

}
