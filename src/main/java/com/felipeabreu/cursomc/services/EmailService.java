package com.felipeabreu.cursomc.services;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import com.felipeabreu.cursomc.domain.Pedido;

public interface EmailService {

//		void sendOrderCofirmationEmail(Pedido obj);
		
		void sendEmail(SimpleMailMessage msg);
		
		void sendOrderConfirmationHtmlEmail(Pedido obj);
		
		void sendHtmlEmail(MimeMessage msg);

		void sendOrderConfirmationEmail(Pedido obj);
}
