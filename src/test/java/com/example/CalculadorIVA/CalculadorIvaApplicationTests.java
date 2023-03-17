package com.example.CalculadorIVA;

import com.example.CalculadorIVA.controller.SumaController;
import com.example.CalculadorIVA.servicios.SumaServicio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.annotation.AuthenticationPrincipal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculadorIvaApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	public SumaServicio sm;

	@Autowired
	public SumaController sc;

	@Test
	public void testCrearSuma(){


	}

}
