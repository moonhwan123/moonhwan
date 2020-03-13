package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GroupcodeVO;
import model.ProductDAO;
import model.ProductVO;

/**
 * Servlet implementation class ProductInsertServlet
 */
@WebServlet("/product_insert")
public class ProductInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ProductDAO dao = new ProductDAO();
		
		List<GroupcodeVO> list = dao.groupcodeList();
		
		request.setAttribute("list", list);
		
		RequestDispatcher dis = request.getRequestDispatcher("Product/product_insert.jsp");
		dis.forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		ProductDAO dao = new ProductDAO();
		
		ProductVO vo = new ProductVO();
		
		vo.setCode(request.getParameter("code"));
		vo.setPname(request.getParameter("pname"));
		vo.setCost(Integer.parseInt(request.getParameter("cost")));
		vo.setPnum(Integer.parseInt(request.getParameter("pnum")));
		vo.setJnum(Integer.parseInt(request.getParameter("jnum")));
		vo.setSale(Integer.parseInt(request.getParameter("sale")));
		vo.setGcode(request.getParameter("gcode"));
		
		int row = dao.productInsert(vo);
		
		request.setAttribute("row", row);
		
		RequestDispatcher dis = request.getRequestDispatcher("Product/product_insert_pro.jsp");
		dis.forward(request, response);
		
	}

}
