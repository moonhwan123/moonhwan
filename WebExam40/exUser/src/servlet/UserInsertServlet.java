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
 * Servlet implementation class UserInsertServlet
 */
@WebServlet("/user_insert")
public class UserInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dis = request.getRequestDispatcher("User/user_insert.jsp");
		dis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Connection conn = null;
		
		try {
			conn = DBConn.getConnection();
			UserVO vo = new UserVO();
			UserDAO dao = UserDAO.getInstance();
			String email4 ="";
			String email1 = request.getParameter("email1");
			String email2 = request.getParameter("email2");
			String email3 = request.getParameter("email3");
			if(email3.equals("0")) {
				email4 = email1+"@"+email2;
			}else {
				email4 = email1+email3;
			}
			
			
			String passwd = request.getParameter("passwd");
			
			SHA256 s = new SHA256(passwd.getBytes());
			BASE64Encoder Base64Encoder = new BASE64Encoder();
			
			
			vo.setName(request.getParameter("name"));
			vo.setUserid(request.getParameter("userid"));
			vo.setPasswd(Base64Encoder.encode(s.GetHashCode()));
			vo.setTel(request.getParameter("tel"));
			vo.setEmail(email4);
			
			
			
			boolean flag = dao.UserInsert(vo,conn);
			
			request.setAttribute("flag", flag);
			RequestDispatcher dis = request.getRequestDispatcher("User/user_insert_pro.jsp");
			dis.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
				
		
		
		
		
	}

}
