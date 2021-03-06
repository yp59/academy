package study.servlet.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import study.beans.MemberDao;
import study.beans.MemberDto;
@WebServlet(urlPatterns = "/member/insert.kh")
public class MemberInsertServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try {
			MemberDto memberDto= new MemberDto();
				memberDto.setMember_id(req.getParameter("id"));
				memberDto.setMember_pw(req.getParameter("pw"));
				memberDto.setMember_nick(req.getParameter("nick"));
				memberDto.setMember_birth(req.getParameter("birth"));
				memberDto.setMember_phone(req.getParameter("phone"));
				memberDto.setMember_email(req.getParameter("email"));
				
			MemberDao memberDao = new MemberDao();
			
			memberDao.regist(memberDto);
				resp.setCharacterEncoding("MS949");
			resp.getWriter().println("가입완료");
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
			
		}
	
	}
	
}
