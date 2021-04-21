package study.servlet.jdbc;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import study.beans.ItemDao;
import study.beans.ItemDto;
@WebServlet(urlPatterns = "/item/list.kh")

public class ItemListServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	try {
		ItemDao itemDao = new ItemDao();
		List<ItemDto> itemlist = itemDao.list();
		
		resp.setCharacterEncoding("MS949");
		resp.getWriter().println("데이터 개수 : "+itemlist.size());
		
		for(ItemDto itemDto : itemlist) {
			resp.getWriter().println(itemDto);
			
		}
	}catch(Exception e) {
		e.printStackTrace();
		resp.sendError(500);
	}
	
	}
}
