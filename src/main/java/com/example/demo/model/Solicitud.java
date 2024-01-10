package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "solicitud")
@Getter
@Setter
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsolicitud")
    private Integer idSolicitud;

    @Column(name = "Fecha_Solicitud")
    private Date fechaSolicitud;

    @Column(name = "Nombre_Trabajador")
    private String nombreTrabajador;

    @Column(name = "Nombre_Producto")
    private String nombreProducto;

    @Column(name = "Cantidad")
    private Integer cantidad;

    @Column(name = "Talla")
    private String talla;
    
    @Column(name = "Actividad_aRealizar")
    private String actividad;

    @Column(name = "Proyecto")
    private String proyecto;

    @Column(name = "Area")
    private  String area;

    @Column(name = "Observaciones")
    private String observaciones;
}
