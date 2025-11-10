package com.senai.infoa.trabalhosenai.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

           @PutMapping("/atualizar-boolean/{id}")                            
    public String atualizarBoolean(@PathVariable Integer usuarioId, @RequestBody Usuario usuario){
        boolean atualizou = usuarioService.atualizarBoolean(usuario, usuarioId);
        if (atualizou){
            return "Usuário atualizado com sucesso!";
        }
        return "Falha ao atualizar o usuário.";

    }



}