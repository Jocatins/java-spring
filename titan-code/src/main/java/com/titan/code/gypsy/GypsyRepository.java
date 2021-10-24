package com.titan.code.gypsy;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface GypsyRepository extends CrudRepository<Gypsy, String> {
	public List<Gypsy> findByTitanId(String titanId);

}
