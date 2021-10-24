package com.titan.code.gypsy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.titan.code.titans.Titan;

@RestController
public class GypsyController {
	
	@Autowired
	private GypsyService gypsyService;

	@RequestMapping("/titans/{id}/gypsies")
	public List<Gypsy> getAllGypsies(@PathVariable String id) {
		return gypsyService.getAllGypsies(id);
	}
	@RequestMapping("/titans/{titanId}/gypsies/{id}")
	public Gypsy getGypsy(@PathVariable String id) {
		return gypsyService.getGypsy(id);
	}
	@RequestMapping(method= RequestMethod.POST, value="/titans/{titansId}/gypsies")
	public void addGypsy(@RequestBody Gypsy gypsy , @RequestBody String titanId) {
		gypsy.setTitan(new Titan(titanId, 0, titanId, titanId));
		gypsyService.addGypsy(gypsy);
	}
	@RequestMapping(method= RequestMethod.PUT, value="/titans/{titanId}/gypsies/{id}")
	public void updateGypsy(@RequestBody Gypsy gypsy, @PathVariable String id, @RequestBody String titanId) {
		gypsy.setTitan(new Titan(titanId, 0, titanId, titanId));
		gypsyService.updateGypsy(gypsy);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/titans/{titanId}/gypsies/{id}")
	public void deleteGypsy(@PathVariable String id) {
		gypsyService.deleteGypsy(id);
	}
}
