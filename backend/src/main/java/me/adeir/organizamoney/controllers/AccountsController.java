package me.adeir.organizamoney.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/accounts")
public class AccountsController {
    @GetMapping("/")
    public String getAllAccounts() {
        return "Lista de gastos!";
    }

    @PostMapping("/")
    public String createAccount() {
        return "Criar de gasto!";
    }

    @GetMapping("/{id}")
    public String getAccount(@PathVariable String id, @RequestBody String entity) {
        //TODO: process GET request
        
        return entity;
    }

    @PutMapping("/{id}")
    public String putAccount(@PathVariable String id, @RequestBody String entity) {
        //TODO: process PUT request
        
        return entity;
    }

    @DeleteMapping("/{id}")
    public String deleteAccount(@PathVariable String id, @RequestBody String entity) {
        //TODO: process DELETE request
        
        return entity;
    }
}
