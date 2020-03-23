package servlet.gallery;

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

import model.gallery.PhotoDAO;
import model.gallery.PhotoVO;
import model.portfolio.PortfolioDAO;
import model.portfolio.PortfolioVO;
import util.DBConn;

/**
 * Servlet implementation class PhotoWriteServlet
 */
@WebServlet("/photo_write")
public class PhotoWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PhotoWriteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dis = request.getRequestDispatcher("/gallery/photo_write.jsp");
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
			
			PhotoVO vo = new PhotoVO();
			vo.setSubject(subject);
			vo.setContents(contents);
			vo.setFilename(filename);
			
			PhotoDAO dao = PhotoDAO.getInstance();
			
			int row = dao.galleryWrite(vo,conn);
			
			request.setAttribute("row", row);
			RequestDispatcher dispater = request.getRequestDispatcher("/gallery/photo_write_pro.jsp");
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
