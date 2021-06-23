package com.kh.spring06;

import org.springframework.beans.factory.annotation.Autowired;

import com.kh.spring06.entity.ItemDto;
import com.kh.spring06.repositoy.ItemDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class ItemController {

	
	@Autowired
	private ItemDao itemDao;
	
	@GetMapping("/insert")
	public String insert() {
	
		return "insert";
		
	}
	
	@PostMapping("/insert")
	public String insert(@ModelAttribute ItemDto itemDto) {
		
		itemDao.insert(itemDto);
		
		return "redirect:insert";
	}
}
