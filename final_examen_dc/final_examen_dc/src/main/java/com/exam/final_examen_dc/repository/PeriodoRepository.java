package com.exam.final_examen_dc.repository;

import com.exam.final_examen_dc.model.Periodo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodoRepository extends MongoRepository<Periodo, Long> {

}
