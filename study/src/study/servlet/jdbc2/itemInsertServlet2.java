package study.servlet.jdbc2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.ItemDao;
import study.beans.ItemDto;

@WebServlet(urlPatterns = "/jsp/itemInsert2.kh")
public class itemInsertServlet2 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try {
			
			req.setCharacterEncoding("UTF-8");
			String itemName = req.getParameter("itemName");
			int itemPrice = Integer.parseInt(req.getParameter("itemPrice"));
			
			ItemDto itemDto = new ItemDto();
			itemDto.setItemName(itemName);
			itemDto.setItemPrice(itemPrice);
			
			ItemDao itemDao = new ItemDao();
			int itemNo = itemDao.sequence();
			itemDto.setItemNo(itemNo);
			itemDao.insert2(itemDto);
			
			resp.sendRedirect("http://localhost:8080/study/jsp/itemDetail.jsp?itemNo="+itemNo);
			
		}catch(Exception e) {
			
			e.printStackTrace();
			resp.sendError(500);
		}
	
	}
}
