package study.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 필터
 * 
 * 사용자의 요청을 접수하기 전에 검사할 수 있는 도구
 * 서블릿과 함께 자바웹에서 제공하는 요청처리도구
 * 필요하다면 요청을 중간에 검사하여 올바르지 않을 경우 차단 또는 다른곳으로 이동 처리가 가능
 * 
 * 생성방법은 서블릿과 유사
 * 
 * javax.servlet.Filter를 상속받는다
 * 주소를 등록한다.
 * 메소드를 재정의하고 ㅝㄴ하는 코드를 작성한다.
 * 주소는 신규주소가 아니라 만들어져있는 주소를 설정해야 한다.
 * 3.메소드를 정의하고 원하는 코드를 작성한다.
 * 
 * */

@WebFilter(urlPatterns = "/jsp/MemberList.jsp")
public class testFilter implements Filter {
@Override
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
		throws IOException, ServletException {

	//서블릿과 같이 코드를 작성하고 싶다면 다운캐스팅을 해야한다.
	HttpServletRequest req= (HttpServletRequest)request;
	HttpServletResponse resp = (HttpServletResponse)response;
	System.out.println("필터작용");
	chain.doFilter(request, response);
}

}
