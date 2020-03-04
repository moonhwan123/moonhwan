package board.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardDAO;
import board.model.BoardVO;
import board.util.PageIndex;

/**
 * Servlet implementation class BoardListServlet
 */
@WebServlet("/board_list")
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO dao = new BoardDAO();
		
		int nowpage=1;	//현재 페이지 
		int maxlist=10; //페이지당 개시글 갯수
		int totpage=1; 	//전체 페이지수
		
		int totcount = dao.boardCount();
		
		if(totcount%maxlist == 0) {
			totpage=totcount/maxlist;
		}else {
			totpage=totcount/maxlist+1;
		}
		
		
		if(request.getParameter("page") != null) {
			nowpage = Integer.parseInt(request.getParameter("page"));
		}
		
		int pagestart = (nowpage-1)*maxlist;
		int endpage = nowpage*maxlist;
		int listcount = totcount-((nowpage-1)*maxlist);
		
		List<BoardVO> list = dao.boardList(pagestart,endpage);
		
		String pageSkip = PageIndex.pageList(nowpage, totpage, "board_list", "");
		
		request.setAttribute("totcount", totcount); //전체글 갯수
		request.setAttribute("list", list); //게시글 리스트
		request.setAttribute("listcount", listcount);
		request.setAttribute("nowpage", nowpage);
		request.setAttribute("totpage", totpage);
		request.setAttribute("pageSkip", pageSkip);
		
		
		
		RequestDispatcher dispatchar = request.getRequestDispatcher("Board/board_list.jsp");
		dispatchar.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String search = request.getParameter("search");
		String key = request.getParameter("key");

		BoardDAO dao = new BoardDAO();
		int cnt = dao.boardCount(search, key);
		List<BoardVO> list = dao.boardList(search, key);
		
		request.setAttribute("list", list);
		request.setAttribute("total", cnt);
		request.setAttribute("search", search);
		request.setAttribute("key", key);
		RequestDispatcher dispatchar = request.getRequestDispatcher("Board/board_list.jsp");
		dispatchar.forward(request, response);
		
		
	}

}
