package com.senai.infoa.trabalhosenai.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.senai.infoa.trabalhosenai.models.Endereco;
import com.senai.infoa.trabalhosenai.repositories.EnderecoRepository;


@Service
public class EnderecoService {

    @Autowired                                          
    private EnderecoRepository enderecoRepository;
                                                     
         public Endereco salvar(String cep, String numero, String referencia) {
        Endereco endereco = buscarViaCep(cep);
        endereco.setNumero(numero);
        endereco.setReferencia(referencia);
        return enderecoRepository.save(endereco);
    }

    public Endereco buscarViaCep(String cep) {
        RestTemplate template = new RestTemplate();
        Endereco endereco = template.getForObject("https://viacep.com.br/ws/{cep}/json", Endereco.class, cep);
        return endereco;
    }
    }