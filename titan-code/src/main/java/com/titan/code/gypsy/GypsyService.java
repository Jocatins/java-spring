package com.titan.code.gypsy;

import java.util.ArrayList;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GypsyService {
	
	@Autowired
	private GypsyRepository gypsyRepository;
	
	//GET all
	public List<Gypsy> getAllGypsies(String titanId){
		List<Gypsy> gypsies = new ArrayList<>();
		gypsyRepository.findByTitanId(titanId)
		.forEach(gypsies::add);
		return gypsies;
	}
	//GET Method id
	public Gypsy getGypsy(String id) {
		return gypsyRepository.findById(id).orElse(new Gypsy());
	}
	//POST Method
	public void addGypsy(Gypsy gypsy) {
		gypsyRepository.save(gypsy);
	}
	//PUT Method
	public void updateGypsy(Gypsy gypsy) {
		gypsyRepository.save(gypsy);	
	}
	public void deleteGypsy(String id) {
		gypsyRepository.deleteById(id);
	}
}
