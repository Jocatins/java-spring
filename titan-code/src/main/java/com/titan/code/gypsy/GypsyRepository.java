package com.titan.code.gypsy;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface GypsyRepository extends CrudRepository<Gypsy, Long> {
	public List<Gypsy> findByTitanId(Long titanId);

}
