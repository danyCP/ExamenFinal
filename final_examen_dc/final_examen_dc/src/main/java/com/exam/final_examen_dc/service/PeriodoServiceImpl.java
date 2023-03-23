package com.exam.final_examen_dc.service;

import com.exam.final_examen_dc.model.Periodo;
import com.exam.final_examen_dc.model.Profesor;
import com.exam.final_examen_dc.repository.PeriodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeriodoServiceImpl extends  GenericServiceImpl{

    @Autowired
    private PeriodoRepository periodoRepository;
    @Override
    public CrudRepository getDao() {
        return periodoRepository;
    }

    @Override
    public List<Periodo> findByAll() {
        return periodoRepository.findAll();
    }

    @Override
    public Periodo save(Periodo periodo) {
        return periodoRepository.save(periodo);
    }

    @Override
    public Object findById(Long id) {
        return periodoRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        periodoRepository.deleteById(id);
    }
}
