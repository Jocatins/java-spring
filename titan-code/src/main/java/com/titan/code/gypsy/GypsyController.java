package com.titan.code.gypsy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.titan.code.titans.Titan;

@RestController
@RequestMapping("api/v1/")
public class GypsyController {
	
	@Autowired
	private GypsyService gypsyService;

	@RequestMapping("/titans/{id}/gypsies")
	public List<Gypsy> getAllGypsies(@PathVariable Long id) {
		return gypsyService.getAllGypsies(id);
	}
	@RequestMapping("/titans/{titanId}/gypsies/{id}")
	public Gypsy getGypsy(@PathVariable Long id) {
		return gypsyService.getGypsy(id);
	}
	@RequestMapping(method= RequestMethod.POST, value="/titans/gypsies")
	public ResponseEntity<String> addGypsy(@RequestBody Gypsy gypsy) {
		gypsyService.addGypsy(gypsy); 
		return ResponseEntity.ok("Created Successfully");
	}
	@RequestMapping(method= RequestMethod.PUT, value="/titans/{titanId}/gypsies/{id}")
	public void updateGypsy(@RequestBody Gypsy gypsy, @PathVariable Long id, @RequestBody String titanId) {
		//gypsy.setTitan(new Titan(titanId, 0, titanId, titanId));
		gypsyService.updateGypsy(gypsy);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/titans/{titanId}/gypsies/{id}")
	public void deleteGypsy(@PathVariable Long id) {
		gypsyService.deleteGypsy(id);
	}
}

/*  assignment
1. change db to mysql
2. convert the application to todo manager or start a new project
App Requirements
3. application should have 2 user types
	1. admin
	2. user
Admin should be able to:
	1. Create todo
	2. view all todo (created by anyone)
	3. delete any todo
	4. update any todo
	
User should be able to
	1. create a todo
	2. view all their todo list
	3. update their todo list
	4. delete their todo

*/