package com.exam.final_examen_dc.model;

import java.util.List;

public class Periodo {

    private String periodo;
    private Integer year;

    private Carrera carrera;
    private List<Carrera> Listacarrera;

    public Periodo(String periodo, Integer year, Carrera carrera, List<Carrera> listacarrera) {
        this.periodo = periodo;
        this.year = year;
        this.carrera = carrera;
        Listacarrera = listacarrera;
    }
}
