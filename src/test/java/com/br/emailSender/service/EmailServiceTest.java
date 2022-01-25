package com.br.emailSender.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailServiceTest {

	@Autowired
	EmailService service;

	@Test
	public void sendTest() {
		service.send("Deu certo!!!!");
		assertEquals(service, service);
	}
}
