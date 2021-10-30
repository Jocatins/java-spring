package com.titan.code.gypsy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GypsyService {
	
	@Autowired
	private GypsyRepository gypsyRepository;
	
	//GET all
	public List<Gypsy> getAllGypsies(Long titanId){
		
		/*"
		List<Gypsy> gypsies = new ArrayList<>();
		gypsyRepository.findByTitanId(titanId)
		.forEach(gypsies::add);
		return gypsies;  generics
		*/
		return (List<Gypsy>) this.gypsyRepository.findAll();
	}
	//GET Method id
	public Gypsy getGypsy(Long id) {
		return gypsyRepository.findById(id).orElse(new Gypsy());
	}
	//POST Method
	public void addGypsy(Gypsy gypsy) {
		/*todo::
		// validate the payload
		//get titan from the db; 
		// set titan 
		 * */
		
		gypsyRepository.save(gypsy);
	}
	//PUT Method
	public void updateGypsy(Gypsy gypsy) {
		gypsyRepository.save(gypsy);	
	}
	public void deleteGypsy(Long id) {
		gypsyRepository.deleteById(id);
	}
}
