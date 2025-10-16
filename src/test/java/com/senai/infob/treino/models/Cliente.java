package com.senai.infob.treino.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name="id")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="numero")
    private Double numero;

    @Column(name="senha")
    private Double senha;

    @Column(name="data_nascimento")
    private String dataNascimento;

    @Column(name="genero")
    private String genero;

    public Cliente() {
    }

    public Cliente(Integer id, String nome, Double numero, Double senha, String dataNascimento, String genero) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNumero() {
        return numero;
    }

    public void setNumero(Double numero) {
        this.numero = numero;
    }

    public Double getSenha() {
        return senha;
    }

    public void setSenha(Double senha) {
        this.senha = senha;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
