package com.example.demo.titan;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TitanController {
	
	@RequestMapping("/sphinx")
	public String showTitan() {
		return "titan";
		
	}
	

}
