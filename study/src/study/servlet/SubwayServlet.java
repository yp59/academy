package study.servlet;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/subway.kh")

public class SubwayServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int birth=Integer.parseInt(req.getParameter("age"));
		
		int year = Calendar.getInstance().get(Calendar.YEAR);
		
		birth = year - birth + 1;
		
		resp.setCharacterEncoding("MS949");
		
		if(birth<65&&birth>=20) {
			resp.getWriter().println("1250원");
		}
		else if(birth<20&&birth>=14) {
			resp.getWriter().println("720원");
		}
		else if(birth<14&&birth>=8) {
			resp.getWriter().println("450원");
		}
		else {
			resp.getWriter().println("무료");
		}
			}

	
	
	
}
