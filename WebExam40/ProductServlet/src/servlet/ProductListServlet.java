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
 * Servlet implementation class ProductListServlet
 */
@WebServlet("/product_list")
public class ProductListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductListServlet() {
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

		RequestDispatcher dis = request.getRequestDispatcher("Product/product_list.jsp");
		dis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		ProductDAO dao = new ProductDAO();
		
		String code = request.getParameter("code");
		
		ProductVO vo = dao.productSearch(code);
		List<GroupcodeVO> list = dao.groupcodeList();
		
		request.setAttribute("list", list);
		request.setAttribute("vo", vo);
		System.out.println("vo = " + vo);
		RequestDispatcher dis = request.getRequestDispatcher("Product/product_list.jsp");
		dis.forward(request, response);
		
	}

}
