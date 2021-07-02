package com.kh.spring19.ws;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kh.spring19.entity.MemberDto;
import com.kh.spring19.repository.MemberDao;
import com.kh.spring19.vo.ReceiveVO;
import com.kh.spring19.vo.VisitorVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WebSocketChannelServer extends TextWebSocketHandler{
	
	//채널 개념을 구현하여 저장소를 생성
	//key - String , value - Set<Visitor>
	private Map<String, Set<VisitorVO>> server = new HashMap<>();
	
	//대기실 : Queue<Visitor>
	private BlockingQueue<VisitorVO> waiting = new LinkedBlockingQueue<>();
	
	@Autowired
	private MemberDao memberDao;
	
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		//접속 시에 채널을 알 수 있는 방법이 없으므로 우선 대기실로 입장시킨다.
		// = 사용자가 접속 후에 본인이 몇채널인지 서버로 메세지를 전송해야 한다.
		// = 채널은 사용자가 메세지를 접속하자마자 첫 메세지를 전송하는 순간 알 수 있다.
		Integer memberNo = (Integer) session.getAttributes().get("memberNo");
		
		if(memberNo == null) return; //비회원 고려하지 않음
		
		MemberDto memberDto = memberDao.get(memberNo);
		waiting.add(VisitorVO.builder()
												.memberNo(memberDto.getMemberNo())
												.memberId(memberDto.getMemberId())
												.memberNick(memberDto.getMemberNick())
												.session(session)
											.build());
		log.debug("사용자가 대기실로 입장했습니다. 대기 {} 명", waiting.size());
	}

	//사용자가 보낼 수 있는 메세지의 형태는 크게 2가지
	//일반채팅 메세지
	//채널 입장 메세지
	//따라서 그냥 text만으로는 구분이 어려우므로 json형태로 수신해야한다.
	
	
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		//메세지의 payload를 가져온다 (json String)
		String payload = message.getPayload();
		
		//payload를 receiveVo 객체로 변환
		ObjectMapper mapper = new ObjectMapper();
		ReceiveVO receiveVo = mapper.readValue(payload, ReceviveVO.class);
	}
	
}
