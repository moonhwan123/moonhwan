package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

//회원 등록 폼

/**
 * Servlet implementation class MemberInsertServlet
 */
@WebServlet("/MemberInsertServlet")
public class MemberInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.sendRedirect("Member/userinfo_insert.jsp");
		RequestDispatcher dis = request.getRequestDispatcher("Member/userinfo_insert.jsp");
		dis.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
        
   		String name = null;
   		if(request.getParameter("name") != null){
   			name = request.getParameter("name");
   		}
   		
   		String userid = null;
   		if(request.getParameter("userid") != null){
   			userid = request.getParameter("userid");
   		}
   		
   		String passwd = request.getParameter("passwd");
   		String gubun = request.getParameter("gubun");
   		String tel = request.getParameter("tel");
   		String email = request.getParameter("email");
   		String[] fa = request.getParameterValues("fa");
   		String str = "1";	// fa[]에 데이터가 없을 경우를 대비
   		if(fa != null){
   			str = fa[0];
   			for(int x=1; x<fa.length; x++){
   				str = str + "/ " + fa[x];
   			}
   		}
   		String job = request.getParameter("job");
   		String intro = request.getParameter("intro");
   		
		//db에 저장
		request.setAttribute("name", name);
		request.setAttribute("userid", userid);
		request.setAttribute("passwd", passwd);
		request.setAttribute("gubun", gubun);
		request.setAttribute("tel", tel);
		request.setAttribute("email", email);
		request.setAttribute("str", str);
		request.setAttribute("job", job);
		request.setAttribute("intro", intro);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Member/userinfo_modify.jsp");
		dispatcher.forward(request, response);
   		
   		
		
		
	}

}
