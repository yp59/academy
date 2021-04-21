package study.servlet.jdbc;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import study.beans.ProductDao;
import study.beans.ProductDto;
@WebServlet(urlPatterns = "/product/rank.kh")
public class ProductTopPrice3Servlet extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	int top = Integer.parseInt(req.getParameter("top"));
	int low = Integer.parseInt(req.getParameter("low"));
	
	try {
		ProductDao productDao = new ProductDao();
		
	
		
		List<ProductDto> list = productDao.rank(top,low);
		resp.setCharacterEncoding("MS949");
		resp.getWriter().println(list.size());
		for(ProductDto productDto : list) {
			resp.getWriter().println(productDto);
		}
	
	} catch (Exception e) {
		e.printStackTrace();
		resp.sendError(500);
	}

}
	
	
}
