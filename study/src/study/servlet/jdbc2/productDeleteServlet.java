package study.servlet.jdbc2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.ProductDao;

@WebServlet(urlPatterns = "/jsp/productDelete.kh")
public class productDeleteServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try {
		
		int productNo= Integer.parseInt(req.getParameter("productNo"));
		
		ProductDao productDao = new ProductDao();
		
		boolean result = productDao.productDelete(productNo);
		
		if(result) {
			resp.sendRedirect("productDelete.jsp");
		}
		else {
			resp.sendRedirect("productDeltefail.jsp");
		}
		
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
			
		}
	}
}
