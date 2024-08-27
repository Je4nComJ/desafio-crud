package com.gomesdevelopers.desafio_crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gomesdevelopers.desafio_crud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
