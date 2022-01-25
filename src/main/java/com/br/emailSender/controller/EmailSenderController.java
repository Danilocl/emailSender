package com.br.emailSender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.emailSender.service.EmailService;

@RestController
@RequestMapping(value = "/")
public class EmailSenderController {

	@Autowired
	private EmailService service;

	@PostMapping
	public String sendEmail(@RequestBody String body) {
		try {
			service.send(body);
		} catch (Exception e) {
			e.printStackTrace();
			return "Erro ao enviar email";
		}

		return "Email enviado!";
	}
}
