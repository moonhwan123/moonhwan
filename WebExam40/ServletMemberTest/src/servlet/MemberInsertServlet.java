package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import KISA.SHA256;
import model.MemberDAO;
import model.MemberVO;
import sun.misc.BASE64Encoder;

/**
 * Servlet implementation class MemberInsertServlet
 */
@WebServlet("/userinfo_insert")
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
		RequestDispatcher dis = request.getRequestDispatcher("Member/userinfo_insert.jsp");
		dis.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		MemberDAO dao = new MemberDAO();
		MemberVO vo = new MemberVO();
		String faArr[] = request.getParameterValues("favorite");
		String fa = "";
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		
		SHA256 s = new SHA256(passwd.getBytes());
		BASE64Encoder Base64Encoder = new BASE64Encoder();
		
		if(faArr != null) {
			fa = faArr[0];
			for(int x=1; x<faArr.length; x++) {
				fa = fa + "/" + faArr[x];
			}
		}
		
		vo.setName(request.getParameter("name"));
		vo.setUserid(userid);
//		vo.setPasswd(Base64Encoder.encode(s.GetHashCode()));
		vo.setPasswd(passwd);
		vo.setGubun(request.getParameter("gubun"));
		vo.setZipcode(request.getParameter("zipcode"));
		vo.setAddr1(request.getParameter("addr1"));
		vo.setAddr2(request.getParameter("addr2"));
		vo.setTel(request.getParameter("tel"));
		vo.setEmail(request.getParameter("email"));
		vo.setFavorite(fa);
		vo.setJob(request.getParameter("job"));
		vo.setIntro(request.getParameter("intro"));
	
		
		boolean flag = dao.memberInsert(vo);
		request.setAttribute("userid", userid);
		request.setAttribute("flag", flag);
		RequestDispatcher dis = request.getRequestDispatcher("Member/userinfo_list_pro.jsp");
		dis.forward(request, response);
	}

}
