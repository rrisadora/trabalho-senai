package com.senai.infoa.trabalhosenai.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.senai.infoa.trabalhosenai.models.Endereco;
import com.senai.infoa.trabalhosenai.services.EnderecoService;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
    
    @Autowired
    private EnderecoService enderecoService;

     @PostMapping("/salvar")
    public Endereco salvar(@RequestParam String cep, @RequestParam(required=false) String numero, @RequestParam(required=false) String referencia) {
        return enderecoService.salvar(cep, numero, referencia);
    }
}