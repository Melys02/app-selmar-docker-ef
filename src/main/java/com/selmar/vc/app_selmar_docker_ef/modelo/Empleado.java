package com.selmar.vc.app_selmar_docker_ef.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "Empleado")
public class Empleado {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idEmpleado;
        private String nombre;
        private String puesto;
        private String telefono;
        private String email;


    }
