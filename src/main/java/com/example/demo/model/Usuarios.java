package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario")
    private Integer idUsuario;

    @Column(name = "Nombre_Completo")
    private String nombreCompleto;

    @Column(name = "Numero_ID")
    private Long numeroId;

    @Column(name = "Usuario")
    private String usuario;

    @Column(name = "Contraseña")
    private String contraseña;

    @Column(name = "Confirmar_Contraseña")
    private String confirmarContraseña;

    @Column(name = "Proyecto")
    private String proyecto;

    @Column(name = "Género")
    private String genero;

    @Column(name = "Fecha_Nacimiento")
    private String fechaNacimiento;

    @Column(name = "Correo_Electronico")
    private String correoElectronico;

    @Column(name = "Telefono_Movil")
    private String telefonoMovil;

}
