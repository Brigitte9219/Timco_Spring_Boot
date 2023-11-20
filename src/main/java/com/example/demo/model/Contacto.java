package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "contacto")
@Getter
@Setter
public class Contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcontacto")
    private Integer idContacto;

    @Column(name = "Nombre_Trabajador")
    private String nombre;

    @Column(name = "Correo_Electronico")
    @Email(message = "Por favor, introduce una dirección de correo electrónico válida")
    private String correo;

    @Column(name = "Asunto")
    private String asunto;

    @Column(name = "Mensaje")
    private String mensaje;

}
