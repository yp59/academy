package com.kh.spring09.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor 
@NoArgsConstructor 
@Builder
public class ItemDto {

	private int itemNo;
	private String itemName;
	private int itemPrice;
}
