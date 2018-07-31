package com.felipeabreu.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipeabreu.cursomc.domain.Pedido;
import com.felipeabreu.cursomc.repositories.PedidoRepository;
import com.felipeabreu.cursomc.services.exceptions.ObjectNotFoudException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Pedido obj = repo.findOne(id);
		
		if (obj == null) {
			throw new ObjectNotFoudException("Objeto não encontrado! ID: " + id + ", Tipo: " + Pedido.class.getName());
		}
		
		return obj;
	}
	
}
