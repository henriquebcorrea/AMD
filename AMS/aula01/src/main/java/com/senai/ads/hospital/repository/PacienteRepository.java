package com.senai.ads.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senai.ads.hospital.entities.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}