package com.titan.code.titans;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitanRepository extends CrudRepository<Titan, Long> {

}
