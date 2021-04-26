package study.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import study.beans.HintDao;
import study.beans.HintDto;
import study.beans.QuizDao;
import study.beans.QuizDto;

//[1] 퀴즈 정보만 등록(선 시퀀스 번호 생성 후 등록)
//[2] 힌트 정보를 추가 등록

@WebServlet(urlPatterns = "/quiz/insert.kh")
public class QuizInsertServlet extends HttpServlet{
	//@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			준비
			QuizDto quizDto = new QuizDto();
			quizDto.setQuizContent(req.getParameter("quiz_content"));
			
			String[] hintContents = req.getParameterValues("hint_content");
			
//			계산
			
//			문항 등록(시퀀서 번호 먼저 발급한 뒤 등록, 이렇게 해야 보기를 등록할 때 문항 번호를 사용할 수 있음)
			QuizDao quizDao = new QuizDao();
			int quizNo = quizDao.getSequenceNumber();
			quizDto.setQuizNo(quizNo);
			quizDao.insert(quizDto);
			
//			보기 등록(x보기개수만큼)
			HintDao hintDao = new HintDao();
			
			for(int i=0; i < hintContents.length; i++) {
				HintDto hintDto = new HintDto();
				hintDto.setHintContent(hintContents[i]);
				hintDto.setQuizNo(quizNo);
				hintDao.insert(hintDto);
			}
			
//			출력
			resp.setCharacterEncoding("MS949");
			resp.getWriter().println("퀴즈 등록 완료");
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}