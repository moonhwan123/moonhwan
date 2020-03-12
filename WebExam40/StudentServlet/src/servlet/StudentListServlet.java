package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StudentDAO;
import model.StudentVO;

/**
 * Servlet implementation class StudentListServlet
 */
@WebServlet("/student_list")
public class StudentListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		StudentDAO dao = new StudentDAO();
		List<StudentVO> list = dao.studentList();
		
		for(int x = 0 ; x < list.size(); x++) {
			int kor = list.get(x).getKor();
			int eng = list.get(x).getEng();
			int mat = list.get(x).getMat();
			int tot = kor+eng+mat;
			double ave = ((int)(tot/3.*100))/100.;
			list.get(x).setTot(tot);
			list.get(x).setAve(ave);
			
			String grade = "";
			
			if(100 >= ave && ave >= 90 ) {
				grade = "수";
			}else if(89 >= ave && ave >= 80 ) {
				grade = "우";
			}else if(79 >= ave && ave >= 70 ) {
				grade = "미";
			}else if(69 >= ave && ave >= 60 ) {
				grade = "양";
			}else {
				grade = "가";
			}
			
			list.get(x).setGrade(grade);
			
		}
		
		
		request.setAttribute("list", list);
		RequestDispatcher dis = request.getRequestDispatcher("Student/student_list.jsp");
		dis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
