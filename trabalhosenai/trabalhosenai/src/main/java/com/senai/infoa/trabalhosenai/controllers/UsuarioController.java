package com.senai.infoa.trabalhosenai.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import com.senai.infoa.trabalhosenai.models.Usuario;
import com.senai.infoa.trabalhosenai.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired 
    private UsuarioService usuarioService;

      @PostMapping("/login")
    public String login(@RequestParam String cpf, @RequestParam String senha) {
        return usuarioService.login(cpf,senha);
    }
        @PostMapping("/salvar")
        public Usuario salvar(@RequestBody Usuario usuario, @RequestParam String confirmarSenha) {
            return usuarioService.salvar(usuario, confirmarSenha);
        }



}