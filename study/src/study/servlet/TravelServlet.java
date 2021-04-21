package study.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/travel.kh")
public class TravelServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		int people = Integer.parseInt(req.getParameter("people"));
		int month = Integer.parseInt(req.getParameter("month"));
		int days = Integer.parseInt(req.getParameter("days"));
		
		resp.setCharacterEncoding("MS949");
		int price = people*days*10000;
			
		switch(month){
        case 12,1,2 : 
        	price-=price-price*80/100;
            break;
        case 3,4,5 : 
        	price-=price-price*90/100;;
            break;  
        case 6,7,8 : 
        	price-=price-price*95/100;;
            break;
        case 9,10,11 : 
        	price-=price-price*85/100;;
            break;
            
    }
		resp.getWriter().println("인원수 : "+people+"/"+"일수 : "+days+"/"+price+"원");
	
	}
	
	

}
