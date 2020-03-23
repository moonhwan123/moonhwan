package servlet.portfolio;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.portfolio.PortfolioDAO;
import model.portfolio.PortfolioVO;
import util.DBConn;
import util.SqlMark;

/**
 * Servlet implementation class PortfolioWriteServlet
 */
@WebServlet("/portfolio_write")
public class PortfolioWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PortfolioWriteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dis = request.getRequestDispatcher("/portfolio/portfolio_write.jsp");
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
			
			ServletContext context = getServletContext();
			String path = context.getRealPath("/upload");
			String encType = "UTF-8";
			int maxSize = 2*1024*1024;
			
			MultipartRequest multi = 
					new MultipartRequest(request,path,maxSize,encType,new DefaultFileRenamePolicy());
			//new DefaultFileRenamePolicy() => 동일한 파일이름이 들어올 경우 알아서 이름을 바꿔줌
			
			String subject = multi.getParameter("subject");
			String contents = multi.getParameter("contents");
			String filename = multi.getFilesystemName("filename");
			
			PortfolioVO vo = new PortfolioVO();
			vo.setSubject(subject);
			vo.setContents(contents);
			vo.setFilename(filename);
			
			PortfolioDAO dao = PortfolioDAO.getInstance();
			
			int row = dao.portfolioWrite(vo,conn);
			
			request.setAttribute("row", row);
			RequestDispatcher dispater = request.getRequestDispatcher("/portfolio/portfolio_write_pro.jsp");
			dispater.forward(request, response);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) conn.close();
			} catch (Exception e2) {}
		}
	}

}
