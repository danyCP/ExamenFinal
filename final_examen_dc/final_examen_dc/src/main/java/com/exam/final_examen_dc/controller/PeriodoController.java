package com.exam.final_examen_dc.controller;

import com.exam.final_examen_dc.model.Periodo;
import com.exam.final_examen_dc.repository.PeriodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/periodo")
public class PeriodoController {

    @Autowired
    private PeriodoRepository periodoRepository;

    @GetMapping("/listar")
    public ResponseEntity<List<Periodo>> listarPeriodo (){
        return new ResponseEntity<>(periodoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/periodo")
    public Periodo save(Periodo periodo){
        return periodoRepository.save(periodo);
    }

    @DeleteMapping("/periodo/{id}")
    public void delete(@PathVariable Long id){
        periodoRepository.deleteById(id);
    }
}
