package edu.exemplo;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public double somar(int a, int b){
        return a + b;
    }
}
