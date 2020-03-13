package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ProductDAO;
import model.ProductVO;

/**
 * Servlet implementation class ProductModifyServlet
 */
@WebServlet("/product_modify")
public class ProductModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductModifyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
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
		
		int row = dao.productModify(vo);
		
		request.setAttribute("row", row);
		RequestDispatcher dis = request.getRequestDispatcher("Product/product_modify_pro.jsp");
		dis.forward(request, response);
	}

}
