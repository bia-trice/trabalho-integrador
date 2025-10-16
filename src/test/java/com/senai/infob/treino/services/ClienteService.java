package com.senai.infob.treino.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.treino.models.Cliente;
import com.senai.infob.treino.repositories.ClienteRepository;

@Service
public class ClienteService {
     @Autowired
     private ClienteRepository clienteRepository;

     public Cliente cadastrar(Cliente cliente) {
        return clienteRepository.save(cliente);
     }

     public String login(String email, String senha) {
        Cliente cliente = clienteRepository.findByEmail(email);
        if(cliente != null && senha.equals(cliente.getSenha())){
            return "Login efetuado com sucesso";
        }
        return "Falha ao realizar login";
     }
}
