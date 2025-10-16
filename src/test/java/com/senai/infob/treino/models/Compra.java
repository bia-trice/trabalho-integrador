package com.senai.infob.treino.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="compra")
public class Compra {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name="id")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="data")
    private LocalDate data;

    @Column(name="preco")
    private Double preco;

    public Compra() {
    }

    public Compra(Integer id, String nome, LocalDate data, Double preco) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.preco = preco;
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    
}
