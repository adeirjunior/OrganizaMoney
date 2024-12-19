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
@RequestMapping("/auth")
public class AuthController {
    @GetMapping("/")
    public String getAllUsers() {
        return "Lista de gastos!";
    }

    @PostMapping("/")
    public String createUser() {
        return "Criar de gasto!";
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable String id, @RequestBody String entity) {
        //TODO: process GET request
        
        return entity;
    }

    @PutMapping("/{id}")
    public String putUser(@PathVariable String id, @RequestBody String entity) {
        //TODO: process PUT request
        
        return entity;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id, @RequestBody String entity) {
        //TODO: process DELETE request
        
        return entity;
    }
}
