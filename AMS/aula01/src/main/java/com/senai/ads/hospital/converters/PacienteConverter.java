package com.senai.ads.hospital.converters;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.senai.ads.hospital.dto.PacienteDto;
import com.senai.ads.hospital.entities.Paciente;

@Component
public class PacienteConverter {

    public PacienteDto toDto(Paciente paciente){
        return new PacienteDto(paciente.getNome(), paciente.getDataNascimento());
    }

    public List<PacienteDto> toListDto(List<Paciente> pacientes){
        return pacientes.stream().map(paciente -> toDto(paciente)).collect(Collectors.toList());
    }
    
}
