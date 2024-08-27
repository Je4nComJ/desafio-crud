package com.gomesdevelopers.desafio_crud.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gomesdevelopers.desafio_crud.dto.ClientDTO;
import com.gomesdevelopers.desafio_crud.entities.Client;
import com.gomesdevelopers.desafio_crud.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		Client entity = obj.orElseThrow(() -> new RuntimeException("Entity not found"));
		
		return new ClientDTO(entity);
	}
	
	
}
