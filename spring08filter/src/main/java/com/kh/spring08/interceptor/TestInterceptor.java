package com.kh.spring08.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


/*
 * 인터셉터
 * dispatcherServlet의 부분 작업들을 감시할 수 있는 도구
 * interface handleInterceptor 를 상속받거나
 * class handlerInterceptoradapter를 상속받아 구현한다 비추천
 * 
 * 
 * prehandle :컨트롤러 호출 전 시점을 간섭할 수 있는 메소드
 * posthandle : 컨트롤러 호출 후 시점을 간섭할 수 있는 메소드
 * afterCompletion : 모든 처리의 완료 후 시점을 간섭할 수 있는 메소드
 * */
public class TestInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("prehandle 실행");
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	
		System.out.println("posthandle 실행");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afternoon");
	}
}
