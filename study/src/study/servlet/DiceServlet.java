package study.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/dice.kh")
public class DiceServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		int dice =(int) (Math.random()*6+1);
		
		resp.setCharacterEncoding("MS949");
		resp.getWriter().println("주사위"+dice);
		
		
		
	}

	
}
