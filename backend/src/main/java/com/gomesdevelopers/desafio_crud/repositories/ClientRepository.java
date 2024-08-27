package com.gomesdevelopers.desafio_crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gomesdevelopers.desafio_crud.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
