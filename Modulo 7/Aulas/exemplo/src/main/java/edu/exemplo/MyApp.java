package edu.exemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner { // implementa interface de execução do spring
    @Autowired
    Calculadora calculadora; // Quando a classe é transformada em componente, o spring se responsabiliza pela sua inicialização através do Autowired. Dessa forma não é necessário utilizar o new Classe().
    @Override //anotação para sobrescrever o método run
    public void run(String... args) throws Exception {
        System.out.println("O resultado da soma é "+ calculadora.somar(1,3));
    }
}
