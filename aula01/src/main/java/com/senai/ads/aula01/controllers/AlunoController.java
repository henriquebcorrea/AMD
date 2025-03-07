package com.senai.ads.aula01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.senai.ads.aula01.model.Aluno;

@Controller
public class AlunoController { 

    @GetMapping("/aluno/cadastro")
    public String cadastro(){
        return"cadastro";
    }

    @PostMapping("/aluno/cadastro")
    public String cadastroAluno(Aluno aluno){
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Email: " + aluno.getEmail());
        return "cadastro";
    }
}


