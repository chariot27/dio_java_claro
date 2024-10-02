package com.example.PrimeiroProjeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired(required=true)
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Resultado: "+calculadora.somar(2,3));
    }

}
