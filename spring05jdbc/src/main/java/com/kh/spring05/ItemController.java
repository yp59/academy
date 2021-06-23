package com.kh.spring05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring05.entity.ItemDto;
import com.kh.spring05.repositoy.ItemDao;

@Controller
public class ItemController {

	@Autowired
	private ItemDao itemDao;
	//get/post를 구분하여 사용
	
	//@RequestMapping(value ="/insert", method=RequestMethod.GET)
	@GetMapping("/insert")
	public String insert() {
		
		return "item/insert";
	}
	
	@PostMapping("/insert")
	public String insert(
			@ModelAttribute ItemDto itemDto)throws Exception{
		
		itemDao.insert(itemDto);
		
		return "redirect:insert";
	}
}
