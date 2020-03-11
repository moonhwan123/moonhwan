package servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.mail.MessagingException;
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
import util.MailME;

/**
 * Servlet implementation class UserFindpasswdServlet
 */
@WebServlet("/user_findpasswd")
public class UserFindpasswdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserFindpasswdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		RequestDispatcher dis = request.getRequestDispatcher("User/user_findpasswd.jsp");
		dis.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String userid = request.getParameter("userid");
		
		String sendBunho="";
		for(int i = 0; i < 4; i++) {
		    double dValue = Math.random();
		    int iValue = (int)(dValue * 10);
		    sendBunho=sendBunho+iValue;
		}
		
		UserDAO dao = UserDAO.getInstance();
		Connection conn = null;
		
		try {
			conn = DBConn.getConnection();
			String email = dao.userSearchEmail(userid, conn);
			String subject = "회원님의 임시 비밀번호 입니다.";
			
			SHA256 s = new SHA256(sendBunho.getBytes());
			BASE64Encoder Base64Encoder = new BASE64Encoder();
			
			
			int row = dao.memberUpdate(Base64Encoder.encode(s.GetHashCode()), userid, conn);
			
			
			
			MailME m = new MailME(subject,sendBunho,email);
			
			request.setAttribute("row", row);
			
			RequestDispatcher dis = request.getRequestDispatcher("User/user_findpasswd_pro.jsp");
			dis.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
			} catch (Exception e2) {		}
		}
		
	}

}
