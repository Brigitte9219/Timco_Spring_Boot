package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="producto")
@Getter
@Setter
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idproducto")
    private Integer idProducto;

    @Column (name = "Nombre_Producto")
    private String nombre;

    @Column (name = "Codigo_Interno")
    private Integer codigoInterno;

    @Column (name = "Marca")
    private String marca;

    @Column (name = "Serie")
    private String serie;

    @Column (name = "Fecha_Fabricacion")
    private Date fechaFabricacion;

    @Column (name = "Referencia")
    private String referencia;

    @Column (name = "Lote")
    private String lote;

    @Column (name = "Norma_Tecnica")
    private String normaTecnica;

    @Column (name = "Cantidad")
    private Integer cantidad;

    @Column (name = "Proveedor")
    private String proveedor;

}
