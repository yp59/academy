package study.servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
