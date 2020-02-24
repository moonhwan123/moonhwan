package guest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuestWrite
 */
@WebServlet("/write.do")
public class GuestWrite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuestWrite() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.sendRedirect("Guest/guest_write.jsp");
		RequestDispatcher dispatcher = request.getRequestDispatcher("Guest/guest_write.jsp");
		
		dispatcher.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String subject = request.getParameter("subject");
		String contents = request.getParameter("contents");
		request.setAttribute("name", name);
		request.setAttribute("subject", subject);
		request.setAttribute("contents", contents);
		
		//db에 저장
		request.setAttribute("row", 1);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Guest/guest_modify.jsp");
		dispatcher.forward(request, response);
		
	}

}
