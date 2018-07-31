package com.felipeabreu.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipeabreu.cursomc.domain.Cliente;
import com.felipeabreu.cursomc.repositories.ClienteRepository;
import com.felipeabreu.cursomc.services.exceptions.ObjectNotFoudException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Cliente obj = repo.findOne(id);
		
		if (obj == null) {
			throw new ObjectNotFoudException("Objeto não encontrado! ID: " + id + ", Tipo: " + Cliente.class.getName());
		}
		
		return obj;
	}
	
}
