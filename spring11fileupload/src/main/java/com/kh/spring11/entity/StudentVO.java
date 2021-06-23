package com.kh.spring11.entity;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Dto랑은 다르게 어떤 value object의 값을 받기 위해 사용하는 getter setter class
//VO>Dto

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentVO {

	private String studentName;
	private String studentEmail;
	private MultipartFile studentProfile;
}
