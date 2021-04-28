package study.servlet.jdbc;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import study.beans.ItemDao;
import study.beans.ItemDto;

@WebServlet(urlPatterns = "/item/list2.kh")
public class ItemListServlet2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			ItemDao itemDao = new ItemDao();
			List<ItemDto> list = itemDao.list();
			
//			목표 : list를 HTML 형태로 출력(table 태그)
//			resp.setContentType("text/html");//MIME-TYPE
//			resp.setCharacterEncoding("UTF-8");
			resp.setContentType("text/html; charset=UTF-8");
			
			resp.getWriter().println("<table border='1'>");
			
			resp.getWriter().println("<thead>");
			resp.getWriter().println("<tr>");
			resp.getWriter().println("<th>itemNo</th>");
			resp.getWriter().println("<th>itemName</th>");
			resp.getWriter().println("<th>itemPrice</th>");
			resp.getWriter().println("</tr>");
			resp.getWriter().println("</thead>");
			
			resp.getWriter().println("<tbody>");
			
			//list의 데이터 개수만큼 반복
			for(ItemDto itemDto : list) {
				resp.getWriter().println("<tr>");
				resp.getWriter().println("<td>"+itemDto.getItemNo()+"</td>");
				resp.getWriter().println("<td>"+itemDto.getItemName()+"</td>");
				resp.getWriter().println("<td>"+itemDto.getItemPrice()+"</td>");
				resp.getWriter().println("</tr>");
			}
			resp.getWriter().println("</tbody>");
			
			resp.getWriter().println("</table>");
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
//서블릿으로 표를 나타내기엔 너무 html을 끌어다쓰는게 명령어자체가
//너무 불편한다 이렇게는 잘 안씀 

