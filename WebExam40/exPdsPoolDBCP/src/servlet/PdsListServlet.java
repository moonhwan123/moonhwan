package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PdsDAO;
import model.PdsVO;
import util.DBConn;
import util.PageIndex;

/**
 * Servlet implementation class PdsListServlet
 */
@WebServlet("/pds_list")
public class PdsListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PdsListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		PdsDAO dao = PdsDAO.getInstance();
		Connection conn = null;

		try {
			conn = DBConn.getConnection();

			String s_query = "", addtag = "", query = "", key = "";

			int totcount = 0;
			// post 방식 (검색일 경우)
			if (request.getParameter("key") != null) {
				key = request.getParameter("key");
				query = request.getParameter("search");
				s_query = query + " like '%" + key + "%'";
				addtag = "&search=" + query + "&key=" + key;
				totcount = dao.pdsCount(s_query,conn); // 총 갯수
			} else {
				totcount = dao.pdsCount(conn); // 총 갯수
			}

			int nowpage = 1; // 디폴트 값으로 현재 페이지가 1
			int maxlist = 10; // 페이지 당 글 수
			int totpage = 1; // 총 페이지 수

			if (totcount % maxlist == 0) {
				totpage = totcount / maxlist;
			} else {
				totpage = totcount / maxlist + 1;
			}

			if (request.getParameter("page") != null) {
				nowpage = Integer.parseInt(request.getParameter("page"));
			}

			int page_start = (nowpage - 1) * maxlist;
			int page_end = nowpage * maxlist;
			int listcount = totcount - ((nowpage - 1) * maxlist);

			List<PdsVO> list = null;

			if (key.equals("")) {
				list = dao.pdsList(page_start, page_end,conn);
			} else {
				list = dao.pdsList(s_query, page_start, page_end,conn);
			}

			String pageSkip = PageIndex.pageList(nowpage, totpage, "pds_list", addtag);

			request.setAttribute("totcount", totcount);
			request.setAttribute("list", list); // 게시글 목록
			request.setAttribute("listcount", listcount); // 페이지 수
			request.setAttribute("page", nowpage);
			request.setAttribute("totpage", totpage);
			request.setAttribute("pageSkip", pageSkip);
			request.setAttribute("search", query);
			request.setAttribute("key", key);

			RequestDispatcher dis = request.getRequestDispatcher("Pds/pds_list.jsp");
			dis.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
			} catch (Exception e2) {}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}