package study.servlet.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import study.beans.ItemDao;
import study.beans.ItemDto;
@WebServlet(urlPatterns = "/item/detail.kh")
public class ItemDetailServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int itemNo = Integer.parseInt(req.getParameter("itemNo"));
			
			ItemDao itemDao = new ItemDao();
			
			ItemDto itemDto=itemDao.get(itemNo);
			
			resp.setCharacterEncoding("MS949");
			if(itemDto!=null)
			resp.getWriter().println(itemDto);
			
			else
				resp.getWriter().println("그런거 없다.");
			
			
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
			
		}
	}
}
