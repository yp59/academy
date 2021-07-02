package com.kh.spring19.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @Builder @AllArgsConstructor
@JsonIgnoreProperties(value = {"content"})//없을 수도 있는데 jackson?
public class ReceiveVO {

	private int type;
	private String channel;
	private String content;
}
