package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "reportes")
@Getter
@Setter
public class Reportes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idreportes")
    private Integer idReportes;

    @Column(name = "Nombre_Trabajador")
    private String nombreTrabajador;

    @Column(name = "Numero_ID")
    private Integer numeroId;

    @Column(name = "Nombre_Producto")
    private String nombreProducto;

    @Column(name = "Fecha_Inicio")
    private String fechaInicio;

    @Column(name = "Fecha_Final")
    private String fechaFinal;

    @Column(name = "Proyecto")
    private String proyecto;

    @Column(name = "Area")
    private String area;
}
