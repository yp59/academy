package study.servlet.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import study.beans.ProductDao;
import study.beans.ProductDto;
@WebServlet(urlPatterns = "/product/detail.kh")

public class ProductDtailServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		try {
			int no = Integer.parseInt(req.getParameter("no"));
			
			ProductDao productDao = new ProductDao();
			resp.setCharacterEncoding("MS949");
			ProductDto productDto = productDao.get(no);
		if(productDto!=null) {
			
			resp.getWriter().println(productDto);
		}
		else
			resp.getWriter().print("그런거 없습니다.");
		
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
		
	
	}
}
