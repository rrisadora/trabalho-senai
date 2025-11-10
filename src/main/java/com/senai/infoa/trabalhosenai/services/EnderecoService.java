package com.senai.infoa.trabalhosenai.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.trabalhosenai.models.Endereco;
import com.senai.infoa.trabalhosenai.repositories.EnderecoRepository;


@Service
public class EnderecoService {

    @Autowired                                          
    private EnderecoRepository enderecoRepository;
                                                     
        public Endereco salvar(Endereco endereco){
            return enderecoRepository.save(endereco);

        }

         public Endereco buscar(Integer enderecoId){               
            return enderecoRepository.findById(enderecoId).get();   
        }
    }