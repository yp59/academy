package study.servlet.jdbc;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
