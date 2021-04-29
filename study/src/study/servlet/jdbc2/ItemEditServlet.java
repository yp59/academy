package study.servlet.jdbc2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.ItemDao;
import study.beans.ItemDto;

@WebServlet(urlPatterns = "/jsp/itemEdit.kh")
public class ItemEditServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try {
			req.setCharacterEncoding("UTF-8");
			ItemDto itemDto = new ItemDto();
			itemDto.setItemNo(Integer.parseInt(req.getParameter("itemNo")));
			itemDto.setItemName(req.getParameter("itemName"));
			itemDto.setItemPrice(Integer.parseInt(req.getParameter("itemPrice")));
			
			ItemDao itemDao = new ItemDao();
			itemDao.edit(itemDto);
			
			//resp.sendRedirect("ItemEdit.jsp?itemNo="+itemDto.getItemNo());
			resp.sendRedirect("itemList.jsp");
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
			
		}
	
	}
	
}
