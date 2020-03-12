package servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StudentDAO;
import model.StudentVO;

/**
 * Servlet implementation class StudentInsertServlet
 */
@WebServlet("/student_insert")
public class StudentInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat ( "yyyyMMdd", Locale.KOREA );
		Date currentTime = new Date ();
		String mTime = mSimpleDateFormat.format ( currentTime );
		
		
		request.setAttribute("regdate", mTime);
		RequestDispatcher dis = request.getRequestDispatcher("Student/student_insert.jsp");
		dis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		StudentDAO dao = new StudentDAO();
		
		StudentVO vo = new StudentVO();
		
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int mat = Integer.parseInt(request.getParameter("mat"));
		
		
		
		
		
		vo.setBun(Integer.parseInt(request.getParameter("bun")));
		vo.setName(request.getParameter("name"));
		vo.setGender(request.getParameter("gender"));
		vo.setKor(kor);
		vo.setEng(eng);
		vo.setMat(mat);
		vo.setRegdate(request.getParameter("regdate"));
		
		
		int row = dao.studentInsert(vo);
		
		request.setAttribute("row", row);
		RequestDispatcher dis = request.getRequestDispatcher("Student/student_insert_pro.jsp");
		dis.forward(request, response);
		
	}

}
