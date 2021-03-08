package br.augusto.spring02.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// Controller não acessa o DB diretamente, usa uma camada intermediária (repositório) para chegar no DB

@RestController
@CrossOrigin("*")    // aceita requisições de qualuqer origem / lugar
@RequestMapping("/") //
public class HomeController {
    
    @GetMapping("/")
    public String index() {
        
        return "Bem-vindo à minha API";
    }
}
