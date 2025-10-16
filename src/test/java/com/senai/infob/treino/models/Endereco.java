package com.senai.infob.treino.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="endereco")
public class Endereco {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name="id")
    private Integer id;

    @Column(name="lograudouro")
    private String lograudouro;

    @Column(name="localidade")
    private String localidade;

    @Column(name="cep")
    private Double cep;

    @Column(name="complemento")
    private String complemento;

    @Column(name="bairro")
    private String bairro;

    @Column(name="uf")
    private String uf;

    @OneToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    public Endereco() {
    }

    public Endereco(Integer id, String lograudouro, String localidade, Double cep, String complemento, String bairro,
            String uf, Cliente cliente) {
        this.id = id;
        this.lograudouro = lograudouro;
        this.localidade = localidade;
        this.cep = cep;
        this.complemento = complemento;
        this.bairro = bairro;
        this.uf = uf;
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLograudouro() {
        return lograudouro;
    }

    public void setLograudouro(String lograudouro) {
        this.lograudouro = lograudouro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public Double getCep() {
        return cep;
    }

    public void setCep(Double cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
}