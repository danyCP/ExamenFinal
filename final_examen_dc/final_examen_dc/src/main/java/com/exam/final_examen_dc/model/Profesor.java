package com.exam.final_examen_dc.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Profesor")
@Data
@Getter
@Setter
public class Profesor {
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private String direccion;

    private Asignatura asignatura;
    private List<Asignatura> Listasignatura;

    public Profesor(String nombre, String apellido, String celular, String correo, String direccion, Asignatura asignatura, List<Asignatura> listasignatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.correo = correo;
        this.direccion = direccion;
        this.asignatura = asignatura;
        Listasignatura = listasignatura;
    }
}
