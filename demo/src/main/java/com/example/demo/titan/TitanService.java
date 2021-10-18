package com.example.demo.titan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TitanService {
	List<Titan> titans = new ArrayList<>( Arrays.asList(
			new Titan("gypsy", "jona", "fair" , 67 ),
			new Titan("titan", "julia", "dark" , 87 ),
			new Titan("coder", "nico", "brown" , 27 )
			)); 
	public List<Titan> getAllTitans(){
		return titans;
	}
	//GET Method id
	public Titan getTitan(String id) {
		return titans.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	//POST Method
	public void addTitan(Titan titan) {
		titans.add(titan);
	}
	//PUT Method
	public void updateTitan(String id, Titan titan) {
		for (int i = 0 ; i < titans.size(); i++) {
			Titan t = titans.get(i);
			if (t.getId().equals(id)) {
				titans.set(i, titan);
				return;
			}
		}	
	}
	public void deleteTitan(String id) {
		titans.removeIf(t -> t.getId().equals(id));	
	}
}
