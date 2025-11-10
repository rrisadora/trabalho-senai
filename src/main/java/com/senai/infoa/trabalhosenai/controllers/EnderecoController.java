package com.senai.infoa.trabalhosenai.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.senai.infoa.trabalhosenai.models.Endereco;
import com.senai.infoa.trabalhosenai.services.EnderecoService;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
    
    @Autowired
    private EnderecoService enderecoService;

    @PostMapping("/salvar")
     public Endereco salvar(@RequestBody Endereco endereco) {
        return enderecoService.salvar(endereco);
 }

  @GetMapping("/buscar/{id}")
    public Endereco buscar(@PathVariable Integer id){
        return enderecoService.buscar(id); 
}
}