package servlet.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.board.BoardDAO;



/**
 * Servlet implementation class BoardDeleteServlet
 */
@WebServlet("/board_delete")
public class BoardDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idx = Integer.parseInt(request.getParameter("idx"));
		
		
		
		RequestDispatcher dispater = request.getRequestDispatcher("Board/board_delete.jsp");
		dispater.forward(request, response);
		
		// response.sendRedirect("board_list");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String pass = request.getParameter("pass");
		int idx = Integer.parseInt(request.getParameter("idx"));
		
		
		BoardDAO dao = new BoardDAO();
		
		int row = dao.boardDelete(idx,pass);
		
		request.setAttribute("row", row);
		RequestDispatcher dispater = request.getRequestDispatcher("Board/board_delete_pro.jsp");
		dispater.forward(request, response);
		
	}

}
