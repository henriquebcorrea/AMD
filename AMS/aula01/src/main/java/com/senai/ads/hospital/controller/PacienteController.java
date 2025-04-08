package com.senai.ads.hospital.controller;

import com.senai.ads.hospital.dto.PacienteDto;
import com.senai.ads.hospital.entities.Paciente;
import com.senai.ads.hospital.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @PostMapping("/cadastro")
    public Paciente cadastrarPaciente(@RequestBody Paciente paciente) {
        return pacienteService.cadastrarPaciente(paciente);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<PacienteDto>> listarPacientes() {
        return pacienteService.lista();
    }

    @GetMapping("/busca/{id}")
    public ResponseEntity<PacienteDto> buscaPorId(@PathVariable("id") Long id) {
        return pacienteService.buscaPorId(id);
    }
}