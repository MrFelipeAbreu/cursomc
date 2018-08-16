package com.felipeabreu.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.felipeabreu.cursomc.repositories.CategoriaRepository;
import com.felipeabreu.cursomc.services.DBService;
import com.felipeabreu.cursomc.services.EmailService;
import com.felipeabreu.cursomc.services.MockEmailService;

@Configuration
@Profile("test")
public class TesteConfig {

	@Autowired
	private DBService dbService;
	
		@Bean
		public boolean instantiateDataBase() throws ParseException {
			
			dbService.instantiateDataBase();
			
			return true;
		}
		
		@Bean
		public EmailService emailService() {
			return new MockEmailService();
		}
}
