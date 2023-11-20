package com.example.demo.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "pqrsf")
@Getter
@Setter
public class Pqrsf {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpqrsf")
    private Integer idPqrsf;

    @Column(name = "Nombre_Trabajador")
    private String nombre;

    @Column(name = "Entidad_Empresa")
    private String empresa;

    @Column(name = "Cargo")
    private String cargo;

    @Column(name = "Ciudad")
    private String ciudad;

    @Column(name = "Telefono_Movil")
    private String celular;

    @Column(name = "Correo_Electronico")
    @Email(message = "Por favor, introduce una dirección de correo electrónico válida")
    private String correo;

    @Column(name = "Elija_Opcion")
    private String tramite;

    @Column(name = "Mensaje")
    private String mensaje;

}
