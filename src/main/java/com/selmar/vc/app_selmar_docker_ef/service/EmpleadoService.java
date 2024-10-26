package com.selmar.vc.app_selmar_docker_ef.service;

import com.selmar.vc.app_selmar_docker_ef.modelo.Empleado;
import com.selmar.vc.app_selmar_docker_ef.repository.EmpleadoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service

public class EmpleadoService implements IEmpleadoService{
    private final EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> listarEmpleados() {
        return empleadoRepository.findAll();
    }
}
