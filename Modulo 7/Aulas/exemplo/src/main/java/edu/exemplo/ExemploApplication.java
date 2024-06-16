package edu.exemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemploApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploApplication.class, args);
	/*
	Calculadora calculadora = new Calculadora();
	System.out.println("O resultado da soma é "+ calculadora.somar(1, 8));
	Uma classe com métodos não deve ser instanciada dentro do spring, deve ser transformada em componente
	*/
	}

}
