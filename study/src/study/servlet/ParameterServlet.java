package study.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns ="/param.kh")

public class ParameterServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String q = req.getParameter("q");//문자열 받는 방법
		
		
		int r = Integer.parseInt(req.getParameter("r"));//숫자를 받는 방법
		resp.getWriter().println(q+"/"+r);
	}
	//  요청 객체를 이용하여 데이터 수신
	
	
}
