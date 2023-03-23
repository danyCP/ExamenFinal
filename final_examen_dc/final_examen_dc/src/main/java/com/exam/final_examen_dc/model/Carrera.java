package com.exam.final_examen_dc.model;

import java.util.List;

public class Carrera {

    private String nombre;
    private String descripcion;

    private Ciclo ciclo;

    private List<Ciclo> listaciclo;

    public Carrera(String nombre, String descripcion, Ciclo ciclo, List<Ciclo> listaciclo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ciclo = ciclo;
        this.listaciclo = listaciclo;
    }
}
