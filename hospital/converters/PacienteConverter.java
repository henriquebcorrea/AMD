package com.senai.ads.hospital.converters;

import org.springframework.stereotype.Component;

import com.senai.ads.hospital.dto.PacienteDto;
import com.senai.ads.hospital.entities.Paciente;

@Component
public class PacienteConverter {

    public PacienteDto toDto(Paciente paciente){
        return new PacienteDto(paciente.getNome(), paciente.getDataNascimento());
    }
    
}
