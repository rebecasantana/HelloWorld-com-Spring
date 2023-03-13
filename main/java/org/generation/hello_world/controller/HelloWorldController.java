package org.generation.hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class HelloWorldController {
    
	@GetMapping ("/hello")
    public String HelloWorld() {
        return "Hello World";
    }

    @GetMapping ("/bsm")
    
    public String bsm() {
        return " Persistência\r\n"
	     		+ "- Mentalidade de Crescimento\r\n"
	     		+ "- Orientação ao Futuro\r\n"
	     		+ "- Responsabilidade Pessoal\r\n"
	     		+ "- Trabalho em Equipe\r\n"
	     		+ "- Comunicação\r\n"
	     		+ "- Comunicação Não Violenta\r\n"
	     		+ "- Atenção para Detalhes\r\n"
	     		+ "- Proatividade";
    }

    @GetMapping("/objetivo")
    
    public String objetivo() {
        return "Objetivos de Aprendizagem " +
                "Vídeos da Plataforma " +
                "Exercícios e Projeto integrador";
    }
}