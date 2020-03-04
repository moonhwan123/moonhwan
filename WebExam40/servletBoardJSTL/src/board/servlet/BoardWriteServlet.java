package board.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardDAO;
import board.model.BoardVO;

/**
 * Servlet implementation class BoardWriteServlet
 */
@WebServlet("/board_write")
public class BoardWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardWriteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatchar = request.getRequestDispatcher("Board/board_write.jsp");
		dispatchar.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		BoardVO vo = new BoardVO();
		vo.setName(request.getParameter("name"));
		vo.setEmail(request.getParameter("email"));
		vo.setPass(request.getParameter("pass"));
		vo.setSubject(request.getParameter("subject"));
		vo.setContents(request.getParameter("contents"));
		
		BoardDAO dao = new BoardDAO();
		int row = dao.boardWrite(vo);	
		
		//1번방식
		request.setAttribute("row", row);
		RequestDispatcher dispatchar = request.getRequestDispatcher("Board/board_write_pro.jsp");
		dispatchar.forward(request, response);
		
		//2번방식
//		response.sendRedirect("board_list");
		
		
	}

}
