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
@WebServlet(urlPatterns = "/product/list.kh")
public class ProductListServlet extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	try {
		ProductDao productDao = new ProductDao();
		
		List<ProductDto> list = productDao.list();
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
