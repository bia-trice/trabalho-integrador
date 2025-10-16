package com.senai.infob.treino.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.senai.infob.treino.services.ClienteService;


@PostMapping("/login")
public String login(@RequestParam String email,@RequestParam String senha)
return ClienteService.login(email, senha); 
