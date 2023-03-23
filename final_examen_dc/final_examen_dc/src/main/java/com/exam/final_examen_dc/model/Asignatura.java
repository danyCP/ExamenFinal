package com.exam.final_examen_dc.model;

public class Asignatura {
    private String nombre;
    private Integer n_horas;
    private Integer n_horas_practicas;
    private Integer n_horas_autonomas;

    public Asignatura(String nombre, Integer n_horas, Integer n_horas_practicas, Integer n_horas_autonomas) {
        this.nombre = nombre;
        this.n_horas = n_horas;
        this.n_horas_practicas = n_horas_practicas;
        this.n_horas_autonomas = n_horas_autonomas;
    }
}
