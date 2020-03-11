package servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import KISA.SHA256;
import model.UserDAO;
import model.UserVO;
import sun.misc.BASE64Encoder;
import util.DBConn;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/user_login")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		
		RequestDispatcher dis = request.getRequestDispatcher("User/user_login.jsp");
		dis.forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Connection conn = null;
		UserDAO dao = UserDAO.getInstance();
		
		try {
		conn = DBConn.getConnection();
		String userid = request.getParameter("userid");
		String pass = request.getParameter("passwd");
		
		SHA256 s = new SHA256(pass.getBytes());
		BASE64Encoder Base64Encoder = new BASE64Encoder();
		
		String passwd = Base64Encoder.encode(s.GetHashCode());
		
		int row = dao.userLogin(userid,passwd,conn);
		UserVO vo = dao.userSearch(userid,conn);
		
		request.setAttribute("row", row);
		request.setAttribute("userid", userid);
		request.setAttribute("vo", vo);
		
		RequestDispatcher dis = request.getRequestDispatcher("User/user_login_pro.jsp");
		dis.forward(request, response);
		
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) conn.close();
			} catch (Exception e2) {			}
		}
	}

}
