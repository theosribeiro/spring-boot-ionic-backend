package com.teophiloribeiro.curso.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.teophiloribeiro.curso.domain.Cliente;

//CAMADA DE DADOS

//Acessar o banco e fazer consultas na tabela Cliente, utilizando o id (Integer) como identificador 
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	@Transactional(readOnly=true)
	Cliente findByEmail(String email);
	
	
}
