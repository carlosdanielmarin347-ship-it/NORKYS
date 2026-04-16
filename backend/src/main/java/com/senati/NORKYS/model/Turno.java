package com.senati.NORKYS.model;

// Importamos las anotaciones de JPA para mapear esta clase a la base de datos
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

// Le decimos a Spring/JPA que esta clase representa una entidad en mi base de datos
@Entity

// Indicamos el nombre de la tabla en la base de datos que corresponde a esta entidad
@Table(name = "turno")
public class Turno {

    // Marcamos este atributo como la clave primaria de la tabla
    @Id

    // Configuramos que el valor se genere automáticamente (auto_increment en MySQL)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // Definimos el nombre de la columna en la tabla
    @Column(name = "id_turno")
    private Long id;

    // Definimos otra columna llamada 'nombre' que guardará el nombre del turno
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "hora_inicio")
    private LocalTime horaInicio;

    @Column(name = "hora_fin")
    private LocalTime horaFin;
    //METODOS    GET (Acceder) SET (Modificar)
    // Getters y Setters
    // Permiten acceder y modificar los valores de los atributos desde otras clases

    // Devuelve el ID del turno
    public Long getId() { return id; }

    // Permite cambiar el ID del turno (aunque normalmente lo maneja la BD)
    public void setId(Long id) { this.id = id; }

    // Devuelve el nombre del turno
    public String getNombre() { return nombre; }

    // Permite cambiar el nombre del turno
    public void setNombre(String nombre) { this.nombre = nombre; }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }
}