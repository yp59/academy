package study.servlet.jdbc;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import study.beans.ItemDao;
import study.beans.ItemDto;

@WebServlet(urlPatterns = "/item/edit.kh")
public class ItemEditServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			ItemDto itemDto = new ItemDto();
			itemDto.setItemNo(Integer.parseInt(req.getParameter("itemNo")));
			itemDto.setItemName(req.getParameter("itemName"));
			itemDto.setItemNo(Integer.parseInt(req.getParameter("itemPrice")));
		
			ItemDao itemDao = new ItemDao();
			boolean result = itemDao.edit(itemDto);
			
			resp.setCharacterEncoding("MS949");
			if(result) {
				resp.getWriter().println("수정완료");
			}
			else
				resp.getWriter().println("수정실패");

		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}