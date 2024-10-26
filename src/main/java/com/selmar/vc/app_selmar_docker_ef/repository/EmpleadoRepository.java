package com.selmar.vc.app_selmar_docker_ef.repository;

import com.selmar.vc.app_selmar_docker_ef.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}
