package com.titan.code.titans;

import java.util.ArrayList;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TitanService {
	
	@Autowired
	private TitanRepository titanRepository;
	
	//GET all
	public List<Titan> getAllTitans(){
		List<Titan> titans = new ArrayList<>();
		this.titanRepository.findAll()
		.forEach(titans::add);
		return titans;
	}
	//GET Method id
	public Titan getTitan(Long id) {
		return titanRepository.findById(id).orElse(new Titan());
	}
	//POST Method
	public void addTitan(Titan titan) {
		titanRepository.save(titan);
	}
	//PUT Method
	public void updateTitan(Long id, Titan titan) {
		titanRepository.save(titan);	
	}
	public void deleteTitan(Long id) {
		titanRepository.deleteById(id);
	}
}
