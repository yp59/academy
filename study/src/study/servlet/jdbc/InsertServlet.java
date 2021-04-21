package study.servlet.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import study.beans.ItemDao;
import study.beans.ItemDto;

@WebServlet(urlPatterns = "/insert.kh")
public class InsertServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		목표 : 데이터베이스(오라클) Insert 코드를 JDBC로 수행
//		1. ojdbc8.jar 등록
//		- 기존 Java Project와 다르게 /WebContent/WEB-INF/lib 폴더에 넣기만 하면 자동 등록
//		2. 데이터베이스 코드 구성
		try {
//			준비데이터를 DTO형태로 저장한다
			ItemDto itemDto = new ItemDto();
			itemDto.setItemName(req.getParameter("itemName"));
			itemDto.setItemPrice(Integer.parseInt(req.getParameter("itemPrice")));
			
//			데이터베이스 코드를 DAO 호출 코드로 작성한다
			ItemDao itemDao = new ItemDao();
			itemDao.insert(itemDto);
			
//			사용자에게 알림
			resp.setCharacterEncoding("MS949");
			resp.getWriter().println("item 등록 완료");
		}
		catch(Exception e) {
//			오류가 발생했다는것은 정상적인 진행이 어렵다는 의미이므로 사용자에게 이를 알려야 한다.
			e.printStackTrace();//개발자가 오류 확인을 위한 로그를 출력
			resp.sendError(500);//사용자에게 상태번호 500번 오류를 전송한다
		}
	}
}