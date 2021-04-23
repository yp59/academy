package study.servlet.jdbc;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import study.beans.ItemDao;
import study.beans.ItemDto;

@WebServlet(urlPatterns = "/item/editPrice.kh")
public class ItemPriceEditServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			준비 : 2개(번호 - 조건, 가격 - 수정데이터)
			ItemDto itemDto = new ItemDto();
			itemDto.setItemNo(Integer.parseInt(req.getParameter("itemNo")));
			itemDto.setItemPrice(Integer.parseInt(req.getParameter("itemPrice")));
			
//			계산
			ItemDao itemDao = new ItemDao();
			boolean result = itemDao.editPrice(itemDto);
			
//			출력
			resp.setCharacterEncoding("MS949");
			if(result) {
				resp.getWriter().println("가격 수정 완료");
			}
			else {
				resp.getWriter().println("존재하지 않는 번호");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}