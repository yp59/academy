package study.servlet.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import study.beans.ItemDao;
@WebServlet(urlPatterns = "/item/delete.kh")
public class ItemDeleteServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try {
			//준비
			int itemNo = Integer.parseInt(req.getParameter("no"));
			resp.setCharacterEncoding("MS949");
			//계산
			ItemDao itemDao =new ItemDao();
						
			//출력
			if(itemDao.delete(itemNo)) {
				resp.getWriter().println("삭제완료");
			}
			else
				resp.getWriter().println("해당 상품이 없습니다.");

		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
