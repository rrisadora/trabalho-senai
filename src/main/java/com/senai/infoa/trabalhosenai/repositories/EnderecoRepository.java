package com.senai.infoa.trabalhosenai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infoa.trabalhosenai.models.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{  

}