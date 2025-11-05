package com.senai.infoa.trabalhosenai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.senai.infoa.trabalhosenai.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{  

@Query(value="select * from usuario where cpf = :cpf", nativeQuery=true)
    public Usuario findByCpf(String cpf);
}