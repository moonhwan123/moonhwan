package servlet;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.MailME;

/**
 * Servlet implementation class UserEmailCheckServlet
 */
@WebServlet("/user_emailcheck")
public class UserEmailCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserEmailCheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sendBunho="";
		for(int i = 0; i < 4; i++) {
		    double dValue = Math.random();
		    int iValue = (int)(dValue * 10);
		    sendBunho=sendBunho+iValue;
		}
		
		String email1 = request.getParameter("email1");
		String email2 = request.getParameter("email2");
		String email3 = email1+email2;
		
		String subject = "회원가입 인증 번호 입니다.";
		
		try {
			MailME m = new MailME(subject,sendBunho,email3);
			
		} catch (MessagingException e) {
			
			e.printStackTrace();
		}
		
		request.setAttribute("sendBunho", sendBunho);
		RequestDispatcher dis = request.getRequestDispatcher("User/user_emailcheck.jsp");
		dis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
