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
		request.setCharacterEncoding("UTF-8");
		BoardDAO dao = new BoardDAO();
		
		String s_query="" , addtag="", query="", key="";
		
		int totcount = 0;	//게시글 총 갯수
		
		//post방식으로 데이터가 넘어 왔을때(검색했을때)
		if(request.getParameter("key") != null) {
			key = request.getParameter("key");
			query = request.getParameter("search");
			s_query = query+" like '%"+key+"%'";
			addtag = "&search="+query+"&key="+key;
			totcount = dao.boardCount(s_query);	
		}else {
			totcount = dao.boardCount();
		}
		
		
		int nowpage=1;	//현재 페이지 
		int maxlist=10; //페이지당 개시글 갯수
		int totpage=1; 	//전체 페이지수
		
		
		
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
		
		List<BoardVO> list = null;
		
		if(key.equals("")) {
			list = dao.boardList(pagestart,endpage);
		}else {
			list = dao.boardList(s_query,pagestart,endpage);
		}
		
		String pageSkip = PageIndex.pageList(nowpage, totpage, "board_list", addtag);
		
		request.setAttribute("totcount", totcount); //전체글 갯수
		request.setAttribute("list", list); //게시글 리스트
		request.setAttribute("listcount", listcount);
		request.setAttribute("nowpage", nowpage);
		request.setAttribute("totpage", totpage);
		request.setAttribute("pageSkip", pageSkip);
		request.setAttribute("search", query);
		request.setAttribute("key", key);
		
		
		
		RequestDispatcher dispatchar = request.getRequestDispatcher("Board/board_list.jsp");
		dispatchar.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
