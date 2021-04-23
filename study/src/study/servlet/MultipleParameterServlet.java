package study.servlet;

import java.io.IOException;
import java.util.Arrays;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/multiple.kh")
public class MultipleParameterServlet extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		
			
			String a= req.getParameter("a");
			resp.getWriter().println("a ="+a);
			
			String[] data = req.getParameterValues("a");
			resp.getWriter().println("data = "+Arrays.toString(data));
			
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
