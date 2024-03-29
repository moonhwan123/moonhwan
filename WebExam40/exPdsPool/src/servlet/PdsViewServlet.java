package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PdsDAO;
import model.PdsVO;
import util.SqlMark;

/**
 * Servlet implementation class PdsViewServlet
 */
@WebServlet("/pds_view")
public class PdsViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PdsViewServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int idx = Integer.parseInt(request.getParameter("idx"));
		int page = 1;
		if (request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		PdsDAO dao = PdsDAO.getInstance();

		// 쿠키검사
		boolean check = false; // 내가 넘겨준 쿠키가 있는지 없는지에 대한 체크!
		Cookie info = null;
		Cookie[] cookies = request.getCookies(); // request를 이용해 모든 쿠키의 값을 가져옴

		for (int i = 0; i < cookies.length; i++) {
			info = cookies[i];
			if (info.getName().equals("pds" + idx)) {
				check = true;
			}
			// out.print(info.getName() + ":" + info.getValue() + "<br>");
		}

		String newValue = "" + System.currentTimeMillis();
		if (!check) { // 쿠키가 존재하지 않으면
			dao.pdsCntUp(idx); // 조회수 증가
			info = new Cookie("pds" + idx, newValue);
			// idx 중요함!!!!! 주로 guest 부분은 자기 도메인으로 하는 경우가 많음.
			info.setMaxAge(60 * 60); // 세션(쿠키)를 유지하는 시간표시. 1시간표시. (하루일 경우 : 24*60*60)
			response.addCookie(info);
		}
		PdsVO vo = dao.pdsSelect(idx);
		String content = SqlMark.lineBreak(vo.getContents());
		vo.setContents(content);
		request.setAttribute("vo", vo);
		request.setAttribute("page", page);

		RequestDispatcher dispater = request.getRequestDispatcher("Pds/pds_view.jsp");
		dispater.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
