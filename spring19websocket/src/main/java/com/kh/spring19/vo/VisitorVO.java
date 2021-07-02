package com.kh.spring19.vo;

import org.springframework.web.socket.WebSocketSession;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @Builder @AllArgsConstructor
public class VisitorVO {
	private int memberNo;
	private String memberId;
	private String memberNick;
	private WebSocketSession session;
}