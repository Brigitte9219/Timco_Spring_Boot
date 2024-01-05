package com.example.demo.model;

import java.io.Serializable;


import javax.persistence.*;
import javax.validation.constraints.Email;
import lombok.Data;


@Entity
@Table(name = "trabajador")
@Data
public class Trabajador implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Id autoincrementable
    @Column(name = "idtrabajador")
    private Integer idTrabajador;


    @Column(name = "Nombre_Completo")
    private String nombre;

    @Column(name = "Correo_Electronico")
    @Email(message = "Por favor, introduce una dirección de correo electrónico válida")
    private String correo;

    @Column(name = "Tipo_ID")
    private String tipoId;

    @Column(name = "Numero_ID")
    private Long numeroId;

    @Column(name = "Fecha_Expedicion")
    private String fechaExpedicion;

    @Column(name = "Ciudad_Expedicion")
    private String ciudadExpedicion;

    @Column(name = "Fecha_Nacimiento")
    private String fechaNacimiento;

    @Column(name = "Lugar_Nacimiento")
    private String lugarNacimiento;

    @Column(name = "Edad")
    private Integer edad;

    @Column(name = "Estatura")
    private double estatura;

    @Column(name = "Genero")
    private String genero;

    @Column(name = "Estado_Civil")
    private String estadoCivil;

    @Column(name="RH")
    private String rh;

    @Column(name="Grupo_Sanguineo")
    private String grupoSanguineo;

    @Column(name="Localidad")
    private String localidad;

    @Column(name="Ciudad_Residencia")
    private String ciudadResidencia;

    @Column(name="Barrio")
    private String barrio;

    @Column(name="Direccion")
    private String direccion;

    @Column(name="Telefono_Movil")
    private String telefonoMovil;

    @Column(name="Telefono_Fijo")
    private String telefonoFijo;

    @Column(name="EPS")
    private String eps;

    @Column(name="AFP")
    private String afp;

    @Column(name="Escolaridad")
    private String escolaridad;

    @Column(name="Profesion")
    private String profesion;

    @Column(name="Talla_Camisa")
    private String tallaCamisa;

    @Column(name="Talla_Pantalon")
    private String tallaPantalon;

    @Column(name="Talla_Chaqueta")
    private String tallaChaqueta;

    @Column(name="Talla_Calzado")
    private String tallaCalzado;

    @Column(name="Emergencia_NombreCompleto")
    private String nombreEmergencia;
    
    @Column(name="Emergencia_Parentesco")
    private String parentescoEmergencia;
    
    @Column(name="Emergencia_TelefonoMovil")
    private String movilEmergencia;
    
    @Column(name="Emergencia_TelefonoFijo")
    private String fijoEmergencia;

}
