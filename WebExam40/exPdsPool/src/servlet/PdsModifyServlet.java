package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.PdsDAO;
import model.PdsVO;


/**
 * Servlet implementation class PdsModifyServlet
 */
@WebServlet("/pds_modify")
public class PdsModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PdsModifyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		
		PdsDAO dao = PdsDAO.getInstance();
		PdsVO vo = dao.pdsSelect(idx);
		
		request.setAttribute("vo", vo);
		
		RequestDispatcher dispater = request.getRequestDispatcher("Pds/pds_modify.jsp");
		dispater.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		ServletContext context = getServletContext();
		String path = context.getRealPath("/upload");
		String encType = "UTF-8";
		int maxSize = 2*1024*1024;
		
		
		MultipartRequest multi = 
				new MultipartRequest(request,path,maxSize,encType,new DefaultFileRenamePolicy());
		
		PdsVO vo = new PdsVO();
		PdsDAO dao = PdsDAO.getInstance();
		
		
		
		int idx = Integer.parseInt(multi.getParameter("idx"));
		String name = multi.getParameter("name");
		String pass = multi.getParameter("pass");
		String email = multi.getParameter("email");
		String subject = multi.getParameter("subject");
		String contents = multi.getParameter("contents");
		String filename = multi.getFilesystemName("filename");
		
		if(filename == null || filename.equals("")) {
			vo.setFilename(dao.pdsSelect(idx).getFilename());
		}else {
			vo.setFilename(filename);
		}
		
		
		vo.setIdx(idx);
		vo.setName(name);
		vo.setEmail(email);
		vo.setSubject(subject);
		vo.setContents(contents);
		vo.setPass(pass);

		int row = dao.pdsModify(vo);

		
		request.setAttribute("row", row);
		
		RequestDispatcher dispater = request.getRequestDispatcher("Pds/pds_modify_pro.jsp");
		dispater.forward(request, response);
		
		
	}

}
