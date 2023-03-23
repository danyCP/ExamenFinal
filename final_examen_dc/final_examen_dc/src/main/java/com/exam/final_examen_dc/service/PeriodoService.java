package com.exam.final_examen_dc.service;

import com.exam.final_examen_dc.model.Periodo;

import java.util.List;

public interface PeriodoService extends GenericService<Periodo, Long> {

    @Override
    List<Periodo> findByAll();

    @Override
    Periodo save(Periodo entity);

    @Override
    Periodo findById(Long id);

    @Override
    void delete(Long id);


}
