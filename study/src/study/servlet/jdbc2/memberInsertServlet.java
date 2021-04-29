package study.servlet.jdbc2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.MemberDao;
import study.beans.MemberDto;

@WebServlet(urlPatterns = "/jsp/memberInsert.kh")
public class memberInsertServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//post방식으로 전송되는 데이터는 유니코드가 깨져서 전송되므로 복원코드가 필요하다
		//get방식에서도 오류는 나지 않기 때문에 무조건 쓴다.
		
	try {	req.setCharacterEncoding("UTF-8");
		MemberDto memberDto = new MemberDto();
		memberDto.setMember_id(req.getParameter("memberId"));
		memberDto.setMember_pw(req.getParameter("memberPw"));
		memberDto.setMember_nick(req.getParameter("memberNick"));
		memberDto.setMember_birth(req.getParameter("memberBirth"));
		memberDto.setMember_phone(req.getParameter("memberPhone"));
		memberDto.setMember_email(req.getParameter("memberEmail"));
		
		MemberDao memberDao = new MemberDao();
		memberDao.regist(memberDto);
		
		resp.sendRedirect("http://localhost:8080/study/jsp/memberInsertSuccess.jsp");
		
	}catch(Exception e) {
		e.printStackTrace();
		resp.sendError(500);
		
	}
	}
}
