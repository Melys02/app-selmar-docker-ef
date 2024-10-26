package com.selmar.vc.app_selmar_docker_ef.controller;

import com.selmar.vc.app_selmar_docker_ef.modelo.Empleado;
import com.selmar.vc.app_selmar_docker_ef.service.IEmpleadoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("api/v1/empleado")
public class EmpleadoController {
    private final IEmpleadoService empleadoService;

    @GetMapping("/empleados")
    public List<Empleado> obtenerEmpleados() {
        return empleadoService.listarEmpleados();
    }
}
