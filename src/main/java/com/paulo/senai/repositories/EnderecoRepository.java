package com.paulo.senai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paulo.senai.domain.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{
	//Jpa fará todo o serviço de insert, delete, uptade, etc...
	//Veja que busca de Cliente e o Integer e que tipo do nosso id e Integer
	//Veja que é uma inteface que extende os recusrsos do JPA.

}
