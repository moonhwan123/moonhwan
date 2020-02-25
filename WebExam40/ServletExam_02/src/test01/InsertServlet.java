package test01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String jumin1 = request.getParameter("jumin1");
		String jumin2 = request.getParameter("jumin2");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String repwd = request.getParameter("repwd");
		String email1 = request.getParameter("email1");
		String email2 = request.getParameter("email2");
		String email_select = request.getParameter("email_select");
		if(email2 == "" || email2.equals("")) {
			email2 = email_select;
		}
		String post = request.getParameter("post");
		String addr1 = request.getParameter("addr1");
		String addr2 = request.getParameter("addr2");
		String phone = request.getParameter("phone");
		String job = request.getParameter("job");
		String susin = request.getParameter("susin");
		String interest[] = request.getParameterValues("interest");
		
		String inter = interest[0];
		for(int x = 1; x < interest.length; x++) {
			inter = inter+","+interest[x];
		}
		
		request.setAttribute("name", name);
		request.setAttribute("jumin1", jumin1);
		request.setAttribute("jumin2", jumin2);
		request.setAttribute("id", id);
		request.setAttribute("pwd", pwd);
		request.setAttribute("repwd", repwd);
		request.setAttribute("email1", email1);
		request.setAttribute("email2", email2);
		request.setAttribute("post", post);
		request.setAttribute("addr1", addr1);
		request.setAttribute("addr2", addr2);
		request.setAttribute("phone", phone);
		request.setAttribute("job", job);
		request.setAttribute("susin", susin);
		request.setAttribute("inter", inter);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("userjoin_pro.jsp");
		dispatcher.forward(request, response);
		
		
		
		
	}

}
