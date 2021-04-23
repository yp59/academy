package study.servlet.jdbc;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import study.beans.ItemDao;
import study.beans.ItemDto;
import study.beans.MemberDao;
import study.beans.MemberDto;
@WebServlet(urlPatterns = "/member/login.kh")
public class MemberLoginServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String id = req.getParameter("id");
			String pw = req.getParameter("pw");
			
			MemberDao memberDao = new MemberDao();
			MemberDto memberDto = memberDao.login(id, pw);
			resp.setCharacterEncoding("MS949");
		
			if(memberDto!=null) {
				resp.getWriter().println(memberDto.getMember_nick()+"님 환영합니다.");
				
			}
			else
				resp.getWriter().println("아이디와 비밀번호를 확인하세요");
			
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
			
		}
	}
}
