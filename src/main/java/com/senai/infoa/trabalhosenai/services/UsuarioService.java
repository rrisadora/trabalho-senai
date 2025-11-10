package com.senai.infoa.trabalhosenai.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.trabalhosenai.models.Usuario;
import com.senai.infoa.trabalhosenai.repositories.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired                                           
    private UsuarioRepository usuarioRepository;

        public String login(String cpf, String senha){
    Usuario usuario = usuarioRepository.findByCpf(cpf);
    if(usuario != null && senha.equals(usuario.getSenha())){
        return "Login efetuado com sucesso!";
        }
        return "Falha ao realizar login";
    }
        public Usuario salvar(Usuario usuario, String confirmarSenha){
            if(usuario.getSenha().equals(confirmarSenha)) {
                return usuarioRepository.save(usuario);

        }
        return null;
    }

   public boolean atualizarBoolean(Usuario usuario, Integer usuarioId){               
            if (usuarioRepository.existsById(usuarioId)){
                usuario.setUsuarioId(usuarioId);                                           
                usuarioRepository.save(usuario);
                return true;
            }
            return false;

        }

}
