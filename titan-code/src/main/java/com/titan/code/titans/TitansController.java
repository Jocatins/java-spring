package com.titan.code.titans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TitansController {
	
	@Autowired
	private TitanService titanService;

	@RequestMapping("/titans")
	public List<Titan> getAllTitans() {
		return titanService.getAllTitans();
	}
	@RequestMapping("/titans/{id}")
	public Titan getTitan(@PathVariable String id) {
		return titanService.getTitan(id);
	}
	@RequestMapping(method= RequestMethod.POST, value="/titans")
	public void addTitan(@RequestBody Titan titan) {
		titanService.addTitan(titan);
	}
	@RequestMapping(method= RequestMethod.PUT, value="/titans/{id}")
	public void updateTitan(@RequestBody Titan titan, @PathVariable String id) {
		titanService.updateTitan(id, titan);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/titans/{id}")
	public void deleteTitan(@PathVariable String id) {
		titanService.deleteTitan(id);
	}
}
