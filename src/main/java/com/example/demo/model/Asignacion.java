package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "asignacion")
@Getter
@Setter
public class Asignacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idasignacion")
    private Integer idAsignacion;

    @Column(name = "Fecha_Asignacion")
    private Date fechaAsignacion;

    @Column(name = "Nombre_Trabajador")
    private String nombreTrabajador;

    @Column(name = "Nombre_Producto")
    private String nombreProducto;

    @Column(name = "Cantidad")
    private Integer cantidad;

    @Column(name = "Talla")
    private String talla;

    @Column(name = "Proyecto")
    private String proyecto;

    @Column(name = "Area")
    private  String area;

    @Column(name = "Observaciones")
    private String observaciones;

}
