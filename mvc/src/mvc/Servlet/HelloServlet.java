package mvc.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/Hello.kh")
public class HelloServlet extends HttpServlet{
//forward
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	try {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/Hello.jsp");
		dispatcher.forward(req, resp);
		
	}catch(Exception e) {
	e.printStackTrace();
	resp.sendError(500);
	}

	}
	
}
