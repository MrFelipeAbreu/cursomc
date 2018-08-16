package com.felipeabreu.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.felipeabreu.cursomc.domain.Pedido;

public interface EmailService {

		void sendOrderCofirmationEmail(Pedido obj);
		
		void sendEmail(SimpleMailMessage msg);
}
