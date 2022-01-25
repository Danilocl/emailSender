package com.br.emailSender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

	@Autowired
	private JavaMailSender mailSender;

	public void send(String message) {
		SimpleMailMessage email = new SimpleMailMessage();
		email.setTo("danilocalessa@gmail.com");
		email.setSubject("Testando o envio de email pelo Spring!!");
		email.setText(message);
		mailSender.send(email);
	}
}
