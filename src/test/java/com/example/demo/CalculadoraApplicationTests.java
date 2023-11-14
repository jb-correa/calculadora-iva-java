package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import services.SumaService;


@SpringBootTest
class CalculadoraApplicationTests {

	@Bean
	


	@Test
	void contextLoads() {

	}

	@Test
	void creacionSuma(){

		sumaService.crearSuma(100, 21);

	}

}
