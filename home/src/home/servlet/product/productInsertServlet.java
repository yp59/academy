package home.servlet.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.ProductDao;
import home.beans.ProductDto;

@WebServlet(urlPatterns = "/product/productInsert.kh")
public class productInsertServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	try {
		req.setCharacterEncoding("UTF-8");
		
		ProductDao productDao = new ProductDao();
		ProductDto productDto = new ProductDto();
		
		productDto.setName(req.getParameter("productName"));
		productDto.setType(req.getParameter("productType"));
		productDto.setPrice(Integer.parseInt(req.getParameter("productPrice")));
		productDto.setMade(req.getParameter("productMade"));
		productDto.setExpire(req.getParameter("productExpire"));
		
		productDao.registItem(productDto);
		resp.sendRedirect("http://localhost:8080/home/product/productList.jsp");
	}catch(Exception e) {
		e.printStackTrace();
		resp.sendError(500);
	}
	}
	
}
