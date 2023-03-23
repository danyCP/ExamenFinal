package com.exam.final_examen_dc.model;

import java.util.List;

public class Ciclo {

    private String nombre;
    private String descripcion;


    private Profesor profesor;

    private List<Profesor> Listaprofesor;


    public Ciclo(String nombre, String descripcion, Profesor profesor, List<Profesor> listaprofesor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.profesor = profesor;
        Listaprofesor = listaprofesor;
    }
}
