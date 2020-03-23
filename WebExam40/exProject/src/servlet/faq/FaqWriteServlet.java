package servlet.faq;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.faq.FaqDAO;
import model.faq.FaqVO;
import util.DBConn;
import util.SqlMark;

/**
 * Servlet implementation class FaqWriteServlet
 */
@WebServlet("/faq_write")
public class FaqWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FaqWriteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Connection conn = null;
		FaqDAO dao = FaqDAO.getInstance();
		
		try {
		conn = DBConn.getConnection();
		String subject = request.getParameter("subject");
		String con = request.getParameter("contents");
		String contents = SqlMark.lineBreak(con);
		FaqVO vo = new FaqVO();
		vo.setContents(contents);
		vo.setSubject(subject);
		
		int row = dao.faqWrite(vo, conn);
		
		request.setAttribute("row",row);
		RequestDispatcher dis = request.getRequestDispatcher("/faq/faq_write_pro.jsp");
		dis.forward(request, response);
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
			} catch (Exception e2) {}
		}
		
	}

}
