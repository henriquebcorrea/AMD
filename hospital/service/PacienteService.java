package com.senai.ads.hospital.service;

import com.senai.ads.hospital.converters.PacienteConverter;
import com.senai.ads.hospital.dto.PacienteDto;
import com.senai.ads.hospital.entities.Paciente;
import com.senai.ads.hospital.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PacienteService {

    @Autowired
    PacienteRepository repository;

    @Autowired
    PacienteConverter converter;

    public Paciente cadastrarPaciente(Paciente paciente) {
        return repository.save(paciente);
    }

    public List<Paciente> listarPacientes() {
        return repository.findAll();
    }

    public ResponseEntity<List<PacienteDto>> lista() {
        List<Paciente> pacientes = new ArrayList<>();
        pacientes = repository.findAll();
        List<PacienteDto> pacientesDto = new ArrayList<>();

        for (Paciente paciente : pacientes) {
            pacientesDto.add(converter.toDto(paciente));
        }

        return new ResponseEntity<>(pacientesDto, HttpStatus.OK);
    }

    public ResponseEntity<PacienteDto> buscaPorId(Long id) {
        Paciente paciente = new Paciente();
        paciente = repository.findById(id).orElse(null);
        return new ResponseEntity<>(converter.toDto(paciente), HttpStatus.OK);
    }
}